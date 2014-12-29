package com.handstandtech.flickr.shared.model.places;

import com.handstandtech.flickr.shared.model.content.FlickrStringContent;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@Data
public class FlickrPlaceInfo extends FlickrStringContent implements Country {

	/**
	 * Default Serialization UID
	 */
	private static final long serialVersionUID = 1L;

	private Double latitude;

	private Double longitude;

	private String place_id;

	private String place_url;

	private String woeid;

	@Override
	public String getName() {
		return _content;
	}

	@Override
	public String getWoeId() {
		return woeid;
	}

	@Override
	public String getPlaceId() {
		return place_id;
	}

	@Override
	public String getPlaceUrl() {
		return place_url;
	}

}