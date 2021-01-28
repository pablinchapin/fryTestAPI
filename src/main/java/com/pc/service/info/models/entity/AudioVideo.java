package com.pc.service.info.models.entity;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AudioVideo {
	
	/*
	"wrapperType": "track",
    "kind": "music-video",
    "artistId": 909253,
    "collectionId": 1445738051,
    "trackId": 1445738215,
    "artistName": "Jack Johnson",
    "collectionName": "To the Sea",
    "trackName": "You And Your Heart",
    "collectionCensoredName": "To the Sea",
    "trackCensoredName": "You And Your Heart (Closed-Captioned)",
    "artistViewUrl": "https://music.apple.com/us/artist/jack-johnson/909253?uo=4",
    "collectionViewUrl": "https://music.apple.com/us/music-video/you-and-your-heart-closed-captioned/1445738215?uo=4",
    "trackViewUrl": "https://music.apple.com/us/music-video/you-and-your-heart-closed-captioned/1445738215?uo=4",
    "previewUrl": "https://video-ssl.itunes.apple.com/itunes-assets/Video115/v4/f0/92/0c/f0920ce2-8bb7-5e62-b44c-36ce701fe7b1/mzvf_6922739671336234286.640x352.h264lc.U.p.m4v",
    "artworkUrl30": "https://is1-ssl.mzstatic.com/image/thumb/Video/v4/ae/be/c8/aebec8f3-2baa-7708-1cb9-af064c5423a4/source/30x30bb.jpg",
    "artworkUrl60": "https://is1-ssl.mzstatic.com/image/thumb/Video/v4/ae/be/c8/aebec8f3-2baa-7708-1cb9-af064c5423a4/source/60x60bb.jpg",
    "artworkUrl100": "https://is1-ssl.mzstatic.com/image/thumb/Video/v4/ae/be/c8/aebec8f3-2baa-7708-1cb9-af064c5423a4/source/100x100bb.jpg",
    "collectionPrice": 11.99,
    "trackPrice": -1.00,
    "releaseDate": "2010-06-01T07:00:00Z",
    "collectionExplicitness": "notExplicit",
    "trackExplicitness": "notExplicit",
    "discCount": 1,
    "discNumber": 1,
    "trackCount": 15,
    "trackNumber": 14,
    "trackTimeMillis": 197288,
    "country": "USA",
    "currency": "USD",
    "primaryGenreName": "Rock"
    */
		
	
	private String wrapperType;
	private String kind;
    private Long artistId;
    private Long collectionId;
    private Long trackId;
    private String artistName;
    private String collectionName;
    private String trackName;
    private String collectionCensoredName;
    private String trackCensoredName;
    private String artistViewUrl;
    private String collectionViewUrl;
    private String trackViewUrl;
    private String previewUrl;
    private String artworkUrl30;
    private String artworkUrl60;
    private String artworkUrl100;
    private Double collectionPrice;
    private Double trackPrice;
    private Date releaseDate;
    private String collectionExplicitness;
    private String trackExplicitness;
    private int discCount;
    private int discNumber;
    private int trackCount;
    private int trackNumber;
    private Long trackTimeMillis;
    private String country;
    private String currency;
    private String primaryGenreName;
	
    public AudioVideo() {
		
	}

	public AudioVideo(String wrapperType, String kind, Long artistId, Long collectionId, Long trackId,
			String artistName, String collectionName, String trackName, String collectionCensoredName,
			String trackCensoredName, String artistViewUrl, String collectionViewUrl, String trackViewUrl,
			String previewUrl, String artworkUrl30, String artworkUrl60, String artworkUrl100, Double collectionPrice,
			Double trackPrice, Date releaseDate, String collectionExplicitness, String trackExplicitness, int discCount,
			int discNumber, int trackCount, int trackNumber, Long trackTimeMillis, String country, String currency,
			String primaryGenreName) {
		
		this.wrapperType = wrapperType;
		this.kind = kind;
		this.artistId = artistId;
		this.collectionId = collectionId;
		this.trackId = trackId;
		this.artistName = artistName;
		this.collectionName = collectionName;
		this.trackName = trackName;
		this.collectionCensoredName = collectionCensoredName;
		this.trackCensoredName = trackCensoredName;
		this.artistViewUrl = artistViewUrl;
		this.collectionViewUrl = collectionViewUrl;
		this.trackViewUrl = trackViewUrl;
		this.previewUrl = previewUrl;
		this.artworkUrl30 = artworkUrl30;
		this.artworkUrl60 = artworkUrl60;
		this.artworkUrl100 = artworkUrl100;
		this.collectionPrice = collectionPrice;
		this.trackPrice = trackPrice;
		this.releaseDate = releaseDate;
		this.collectionExplicitness = collectionExplicitness;
		this.trackExplicitness = trackExplicitness;
		this.discCount = discCount;
		this.discNumber = discNumber;
		this.trackCount = trackCount;
		this.trackNumber = trackNumber;
		this.trackTimeMillis = trackTimeMillis;
		this.country = country;
		this.currency = currency;
		this.primaryGenreName = primaryGenreName;
	}

	public String getWrapperType() {
		return wrapperType;
	}

	public void setWrapperType(String wrapperType) {
		this.wrapperType = wrapperType;
	}

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public Long getArtistId() {
		return artistId;
	}

	public void setArtistId(Long artistId) {
		this.artistId = artistId;
	}

	public Long getCollectionId() {
		return collectionId;
	}

	public void setCollectionId(Long collectionId) {
		this.collectionId = collectionId;
	}

	public Long getTrackId() {
		return trackId;
	}

	public void setTrackId(Long trackId) {
		this.trackId = trackId;
	}

	public String getArtistName() {
		return artistName;
	}

	public void setArtistName(String artistName) {
		this.artistName = artistName;
	}

	public String getCollectionName() {
		return collectionName;
	}

	public void setCollectionName(String collectionName) {
		this.collectionName = collectionName;
	}

	public String getTrackName() {
		return trackName;
	}

	public void setTrackName(String trackName) {
		this.trackName = trackName;
	}

	public String getCollectionCensoredName() {
		return collectionCensoredName;
	}

	public void setCollectionCensoredName(String collectionCensoredName) {
		this.collectionCensoredName = collectionCensoredName;
	}

	public String getTrackCensoredName() {
		return trackCensoredName;
	}

	public void setTrackCensoredName(String trackCensoredName) {
		this.trackCensoredName = trackCensoredName;
	}

	public String getArtistViewUrl() {
		return artistViewUrl;
	}

	public void setArtistViewUrl(String artistViewUrl) {
		this.artistViewUrl = artistViewUrl;
	}

	public String getCollectionViewUrl() {
		return collectionViewUrl;
	}

	public void setCollectionViewUrl(String collectionViewUrl) {
		this.collectionViewUrl = collectionViewUrl;
	}

	public String getTrackViewUrl() {
		return trackViewUrl;
	}

	public void setTrackViewUrl(String trackViewUrl) {
		this.trackViewUrl = trackViewUrl;
	}

	public String getPreviewUrl() {
		return previewUrl;
	}

	public void setPreviewUrl(String previewUrl) {
		this.previewUrl = previewUrl;
	}

	public String getArtworkUrl30() {
		return artworkUrl30;
	}

	public void setArtworkUrl30(String artworkUrl30) {
		this.artworkUrl30 = artworkUrl30;
	}

	public String getArtworkUrl60() {
		return artworkUrl60;
	}

	public void setArtworkUrl60(String artworkUrl60) {
		this.artworkUrl60 = artworkUrl60;
	}

	public String getArtworkUrl100() {
		return artworkUrl100;
	}

	public void setArtworkUrl100(String artworkUrl100) {
		this.artworkUrl100 = artworkUrl100;
	}

	public Double getCollectionPrice() {
		return collectionPrice;
	}

	public void setCollectionPrice(Double collectionPrice) {
		this.collectionPrice = collectionPrice;
	}

	public Double getTrackPrice() {
		return trackPrice;
	}

	public void setTrackPrice(Double trackPrice) {
		this.trackPrice = trackPrice;
	}

	public Date getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}

	public String getCollectionExplicitness() {
		return collectionExplicitness;
	}

	public void setCollectionExplicitness(String collectionExplicitness) {
		this.collectionExplicitness = collectionExplicitness;
	}

	public String getTrackExplicitness() {
		return trackExplicitness;
	}

	public void setTrackExplicitness(String trackExplicitness) {
		this.trackExplicitness = trackExplicitness;
	}

	public int getDiscCount() {
		return discCount;
	}

	public void setDiscCount(int discCount) {
		this.discCount = discCount;
	}

	public int getDiscNumber() {
		return discNumber;
	}

	public void setDiscNumber(int discNumber) {
		this.discNumber = discNumber;
	}

	public int getTrackCount() {
		return trackCount;
	}

	public void setTrackCount(int trackCount) {
		this.trackCount = trackCount;
	}

	public int getTrackNumber() {
		return trackNumber;
	}

	public void setTrackNumber(int trackNumber) {
		this.trackNumber = trackNumber;
	}

	public Long getTrackTimeMillis() {
		return trackTimeMillis;
	}

	public void setTrackTimeMillis(Long trackTimeMillis) {
		this.trackTimeMillis = trackTimeMillis;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getPrimaryGenreName() {
		return primaryGenreName;
	}

	public void setPrimaryGenreName(String primaryGenreName) {
		this.primaryGenreName = primaryGenreName;
	}
	
	
	
    
    
    
    
    

}
