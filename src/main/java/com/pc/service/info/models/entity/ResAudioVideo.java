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
public class ResAudioVideo {

	private Long resultCount;
	private List<AudioVideo> results;

	public ResAudioVideo(Long resultCount, List<AudioVideo> results) {
		this.resultCount = resultCount;
		this.results = results;
	}

	public ResAudioVideo() {
		
	}

	public Long getResultCount() {
		return resultCount;
	}

	public void setResultCount(Long resultCount) {
		this.resultCount = resultCount;
	}

	public List<AudioVideo> getResults() {
		return results;
	}

	public void setResults(List<AudioVideo> results) {
		this.results = results;
	}
	
	

}
