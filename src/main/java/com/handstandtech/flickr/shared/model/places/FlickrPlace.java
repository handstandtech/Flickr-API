package com.handstandtech.flickr.shared.model.places;

import com.handstandtech.flickr.shared.model.HasGeo;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class FlickrPlace implements HasGeo {

    /**
     * Default Serialization UID
     */
    private static final long serialVersionUID = 1L;

    private String place_id;

    private FlickrPlaceInfo country;

    private FlickrPlaceInfo county;

    private Integer has_shapedata;

    private Double latitude;

    private Double longitude;

    private FlickrPlaceInfo locality;

    private String name;

    private String woeid;

    private String place_type;

    private Integer place_type_id;

    private String place_url;

    private FlickrPlaceInfo region;

    private FlickrShapedata shapedata;

    private String timezone;

 }
