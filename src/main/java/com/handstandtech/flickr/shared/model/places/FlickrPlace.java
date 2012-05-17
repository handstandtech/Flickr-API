package com.handstandtech.flickr.shared.model.places;

import com.handstandtech.flickr.shared.model.HasGeo;

public class FlickrPlace implements HasGeo{

	/**
	 * Default Serialization UID
	 */
	private static final long serialVersionUID = 1L;
	
	private String place_id;
	
	private FlickrPlaceInfo country;
	
	private FlickrPlaceInfo county;
	
	private Integer has_shapedata;
	
	private Double latitude;
	
	private Double longitude;
	
	private FlickrPlaceInfo locality;
	
	private String name;
	
	private String woeid;
	
	private String place_type;
	
	private Integer place_type_id;
	
	private String place_url;
	
	private FlickrPlaceInfo region;
	
	private FlickrShapedata shapedata;
	
	private String timezone;
	
	public FlickrPlace() {
		
	}

	@Override
	public Double getLatitude() {
		return latitude;
	}

	@Override
	public Double getLongitude() {
		return longitude;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public FlickrPlaceInfo getCountry() {
		return country;
	}

	public FlickrPlaceInfo getCounty() {
		return county;
	}

	public Integer getHas_shapedata() {
		return has_shapedata;
	}

	public FlickrPlaceInfo getLocality() {
		return locality;
	}

	public String getPlace_id() {
		return place_id;
	}

	public String getPlace_type() {
		return place_type;
	}

	public Integer getPlace_type_id() {
		return place_type_id;
	}

	public String getPlace_url() {
		return place_url;
	}

	public FlickrPlaceInfo getRegion() {
		return region;
	}

	public FlickrShapedata getShapedata() {
		return shapedata;
	}

	public String getTimezone() {
		return timezone;
	}

	public String getWoeid() {
		return woeid;
	}

}
