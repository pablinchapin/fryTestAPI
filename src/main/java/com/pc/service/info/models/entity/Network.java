package com.pc.service.info.models.entity;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Network {

	@JsonProperty("id")
	private Long id;

	@JsonProperty("name")
	private String name;

	@JsonProperty("country")
	private Map<String, String> country;

	public Network() {

	}

	public Network(Long id, String name, Map<String, String> country) {

		this.id = id;
		this.name = name;
		this.country = country;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Map<String, String> getCountry() {
		return country;
	}

	public void setCountry(Map<String, String> country) {
		this.country = country;
	}

}
