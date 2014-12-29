package com.handstandtech.flickr.shared.model;

import com.handstandtech.flickr.shared.model.content.FlickrDateContent;
import com.handstandtech.flickr.shared.model.content.FlickrNumberContent;
import com.handstandtech.flickr.shared.model.content.FlickrTimeContent;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@NoArgsConstructor
@Data
public class FlickrPhotos implements Serializable {

	/**
	 * Default Serialization UID
	 */
	private static final long serialVersionUID = 1L;

	private FlickrNumberContent count;

	private FlickrTimeContent firstdate;

	private FlickrDateContent firstdatetaken;

}