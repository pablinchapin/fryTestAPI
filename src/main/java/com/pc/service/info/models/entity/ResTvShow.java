package com.pc.service.info.models.entity;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ResTvShow {

	private List<TvShow> tvShows;

	public ResTvShow() {
	}

	public ResTvShow(List<TvShow> tvShows) {

		this.tvShows = tvShows;
	}

	public List<TvShow> getTvShows() {
		return tvShows;
	}

	public void setTvShows(List<TvShow> tvShows) {
		this.tvShows = tvShows;
	}

}
