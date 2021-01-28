package com.pc.service.info.models.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Schedule {

	@JsonProperty("time")
	private String time;

	@JsonProperty("days")
	private List<String> days;

	public Schedule() {

	}

	public Schedule(String time, List<String> days) {

		this.time = time;
		this.days = days;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public List<String> getDays() {
		return days;
	}

	public void setDays(List<String> days) {
		this.days = days;
	}

}
