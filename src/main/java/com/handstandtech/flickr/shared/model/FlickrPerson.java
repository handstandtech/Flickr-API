package com.handstandtech.flickr.shared.model;

import com.handstandtech.flickr.shared.model.content.FlickrStringContent;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@NoArgsConstructor
@Data
public class FlickrPerson implements Serializable {

	/**
	 * Default Serialization UID
	 */
	private static final long serialVersionUID = 1L;

	private Integer iconfarm;

	private String iconserver;

	private String id;

	private Integer ispro;

	private FlickrStringContent location;

	private FlickrStringContent mobileurl;

	private String nsid;

	private String path_alias;

	private FlickrPhotos photos;

	private FlickrStringContent photosurl;

	private FlickrStringContent profileurl;

	private FlickrStringContent realname;

	private FlickrStringContent username;
}
