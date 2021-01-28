package com.pc.service.info.models.entity;

import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Show {

	@JsonProperty("id")
	private Long id;

	@JsonProperty("url")
	private String url;

	@JsonProperty("name")
	private String name;

	@JsonProperty("type")
	private String type;

	@JsonProperty("language")
	private String language;

	@JsonProperty("genres")
	private List<String> genres;

	@JsonProperty("status")
	private String status;

	@JsonProperty("runtime")
	private int runtime;

	@JsonProperty("premiered")
	private String premiered;

	@JsonProperty("officialSite")
	private String officialSite;

	@JsonProperty("schedule")
	private Schedule schedule;

	@JsonProperty("rating")
	private Map<String, Double> rating;

	@JsonProperty("weight")
	private int weight;

	@JsonProperty("network")
	private Network network;

	@JsonProperty("webChannel")
	@JsonInclude(Include.NON_NULL)
	// private String webChannel;
	private Map<String, String> webChannel;

	@JsonProperty("externals")
	@JsonInclude(Include.NON_NULL)
	private Externals externals;

	@JsonProperty("image")
	private Image image;

	@JsonProperty("summary")
	private String summary;

	@JsonProperty("updated")
	private Long updated;

	@JsonProperty("_links")
	private Link _links;

	public Show() {

	}

}
