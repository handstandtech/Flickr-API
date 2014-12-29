package com.handstandtech.flickr.shared.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@NoArgsConstructor
@Data
public class FlickrPhotoset implements Serializable, HasPhotos{

	/**
	 * Default Serialization UID
	 */
	private static final long serialVersionUID = 1L;
	
	private String id;
	
	private String owner;
	
	private String ownername;
	
	private Integer page;
	
	private Integer pages;
	
	private Integer per_page;
	
	private List<FlickrPhoto> photo;

	@Override
	public List<FlickrPhoto> getPhotos() {
		return photo;
	}
}