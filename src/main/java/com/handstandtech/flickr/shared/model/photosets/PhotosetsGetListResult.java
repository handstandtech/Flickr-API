package com.handstandtech.flickr.shared.model.photosets;

import java.io.Serializable;

import com.handstandtech.flickr.shared.model.FlickrPhotosetInfos;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class PhotosetsGetListResult implements Serializable {

	/**
	 * Default Serialization UID
	 */
	private static final long serialVersionUID = 1L;
	
	private FlickrPhotosetInfos photosets;
	
	private String stat;

}
