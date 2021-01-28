package com.pc.service.info.models.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TvShow {

	@JsonProperty("score")
	private Double score;

	@JsonProperty("show")
	private Show show;

	public TvShow() {

	}

	public TvShow(Double score, Show show) {

		this.score = score;
		this.show = show;
	}

	public Double getScore() {
		return score;
	}

	public void setScore(Double score) {
		this.score = score;
	}

	public Show getShow() {
		return show;
	}

	public void setShow(Show show) {
		this.show = show;
	}

	@Override
	public String toString() {
		return "TvShow [score=" + score + ", show=" + show + "]";
	}
	
	
	
	
	

}
