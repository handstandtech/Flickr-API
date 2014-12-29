package com.handstandtech.flickr.shared.model;

import com.handstandtech.flickr.shared.model.content.FlickrStringContent;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@NoArgsConstructor
@Data
public class FlickrUser implements Serializable {

	/**
	 * Default Serialization UID
	 */
	private static final long serialVersionUID = 1L;

	private String id;

	private String nsid;

	private FlickrStringContent username;
}
