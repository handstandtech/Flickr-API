package com.handstandtech.flickr.shared.model.photosets;

import com.handstandtech.flickr.shared.model.FlickrPhotoset;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
public class PhotosetsGetPhotosResult implements Serializable {

	/**
	 * Default Serialization UID
	 */
	private static final long serialVersionUID = 1L;
	
	private FlickrPhotoset photoset;
	
	private String stat;


}
