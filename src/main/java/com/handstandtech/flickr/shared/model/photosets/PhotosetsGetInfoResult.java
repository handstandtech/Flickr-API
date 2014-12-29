package com.handstandtech.flickr.shared.model.photosets;

import com.handstandtech.flickr.shared.model.FlickrPhotosetInfo;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
public class PhotosetsGetInfoResult implements Serializable {

	/**
	 * Default Serialization UID
	 */
	private static final long serialVersionUID = 1L;
	
	private FlickrPhotosetInfo photoset;
	
	private String stat;

}
