package com.handstandtech.flickr.shared.model.people;

import com.handstandtech.flickr.shared.model.FlickrUser;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
public class FindByEmailResult implements Serializable {

	/**
	 * Default Serialization UID
	 */
	private static final long serialVersionUID = 1L;
	
	private FlickrUser user;
	
	private String stat;

}
