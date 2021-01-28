package com.pc.service.info.models.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

public class Link {

	@JsonProperty("self")
	@JsonInclude(Include.NON_NULL)
	private LinkData self;

	@JsonProperty("previousepisode")
	@JsonInclude(Include.NON_NULL)
	private LinkData previousepisode;

	/*
	 * "self": { "href": "http://api.tvmaze.com/shows/30702" }, "previousepisode": {
	 * "href": "http://api.tvmaze.com/episodes/1628538" }
	 */
}
