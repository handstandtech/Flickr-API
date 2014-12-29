package com.handstandtech.flickr.shared.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@NoArgsConstructor
@Data
public class FlickrPhoto implements Serializable, HasGeo {

    /**
     * Default Serialization UID
     */
    private static final long serialVersionUID = 1L;

    private String id;

    private Date datetaken;

    private Double latitude;

    private Double longitude;

    private String title;

    private Long lastupdate;

    private String url_sq;
    private String url_t;
    private String url_s;
    private String url_m;
    private String url_o;

}