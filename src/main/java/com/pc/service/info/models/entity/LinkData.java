package com.pc.service.info.models.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

public class LinkData {

	@JsonProperty("href")
	@JsonInclude(Include.NON_NULL)
	private String href;

}
