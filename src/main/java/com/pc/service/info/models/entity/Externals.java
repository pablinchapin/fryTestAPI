package com.pc.service.info.models.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

public class Externals {

	@JsonProperty("tvrage")
	@JsonInclude(Include.NON_NULL)
	private String tvrage;

	@JsonProperty("thetvdb")
	@JsonInclude(Include.NON_NULL)
	private String thetvdb;

	@JsonProperty("imdb")
	@JsonInclude(Include.NON_NULL)
	private String imdb;

}
