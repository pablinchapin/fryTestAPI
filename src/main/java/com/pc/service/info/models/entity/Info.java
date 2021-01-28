package com.pc.service.info.models.entity;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Info {

	private ResAudioVideo resAudioVideo;

	private List<TvShow> resTvShow;

	public Info() {

	}

	public ResAudioVideo getResAudioVideo() {
		return resAudioVideo;
	}

	
	public void setResAudioVideo(ResAudioVideo resAudioVideo) {
		this.resAudioVideo = resAudioVideo;
	}

	
	public List<TvShow> getResTvShow() {
		return resTvShow;
	}

	public void setResTvShow(List<TvShow> tvShow) {
		// TODO Auto-generated method stub
		this.resTvShow = tvShow;
		
	}

	
		
	
}
