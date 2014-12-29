package com.handstandtech.flickr.shared.model.places;

import com.handstandtech.flickr.shared.model.content.FlickrStringContent;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@NoArgsConstructor
@Data
public class FlickrPolylines implements Serializable {

	/**
	 * Default Serialization UID
	 */
	private static final long serialVersionUID = 1L;
	
	private List<FlickrStringContent> polyline;
	
	private FlickrStringContent shapefile;

}
