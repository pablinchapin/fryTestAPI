package com.pc.service.info.models.service;

import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.json.JSONArray;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import com.pc.service.info.models.entity.Info;
import com.pc.service.info.models.entity.ResAudioVideo;
import com.pc.service.info.models.entity.TvShow;

@Service
public class InfoServiceImpl implements InfoService {

	// @Autowired
	// private RestTemplate restClient;

	private String BASE_URL_AUDIO_VIDEO = "https://itunes.apple.com";
	private String BASE_URL_TV_SHOW = "http://api.tvmaze.com";

	private Logger logger = LoggerFactory.getLogger(InfoServiceImpl.class);

	@Override
	public Info findByData(String query) {

		ResAudioVideo resAudioVideo = resAudioVideo(query);
		List<TvShow> tvShow = resTvShow(query);

		Info info = new Info();

		info.setResAudioVideo(resAudioVideo);
		info.setResTvShow(tvShow);

		return info;
	}

	private ResAudioVideo resAudioVideo(String query) {

		/*
		 * Map<String, String> pathVars = new HashMap<String, String>();
		 * pathVars.put("term", query); pathVars.put("entity", "musicVideo");
		 */
		RestTemplate restClient = new RestTemplate();

		List<HttpMessageConverter<?>> messageConverters = new ArrayList<HttpMessageConverter<?>>();
		
		MappingJackson2HttpMessageConverter converter = new MappingJackson2HttpMessageConverter();

		
		converter.setSupportedMediaTypes(Collections.singletonList(MediaType.ALL));
		messageConverters.add(converter);
		restClient.setMessageConverters(messageConverters);

		URI targetUrl = UriComponentsBuilder.fromUriString(BASE_URL_AUDIO_VIDEO).path("/search")
				.queryParam("term", query).queryParam("entity", "musicVideo").build().encode().toUri();


		ResAudioVideo resAudioVideo = restClient.getForObject(targetUrl, ResAudioVideo.class);

		return resAudioVideo;
	}

	private List<TvShow> resTvShow(String query) {

		RestTemplate restClient = new RestTemplate();

		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));


		URI targetUrl = UriComponentsBuilder.fromUriString(BASE_URL_TV_SHOW).path("/search/shows")
				.queryParam("q", query).build().encode().toUri();

		HttpEntity<String> entity = new HttpEntity<>(headers);
		ResponseEntity<String> response = restClient.exchange(targetUrl, HttpMethod.GET, entity, String.class);

		String rawJson = response.getBody();

		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.setSerializationInclusion(Include.NON_NULL);
		objectMapper.enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);

		// logger.info(rawJson);

		JSONArray array = new JSONArray(rawJson);

		TvShow[] asArray = null;

		try {
			asArray = objectMapper.readValue(rawJson, TvShow[].class);
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		List<TvShow> list = new ArrayList<>(Arrays.asList(asArray));

		return list;

	}

}
