package com.handstandtech.flickr.shared.model;

import com.handstandtech.flickr.shared.model.content.FlickrStringContent;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@NoArgsConstructor
@Data
public class FlickrPhotosetInfo implements Serializable {

	/**
	 * Default Serialization UID
	 */
	private static final long serialVersionUID = 1L;

	private FlickrStringContent description;
	
	private Integer farm;
	
	private String id;
	
	private Integer photos;
	
	private String primary;
	
	private String secret;
	
	private String server;
	
	private FlickrStringContent title;
	
	private Integer videos;

}