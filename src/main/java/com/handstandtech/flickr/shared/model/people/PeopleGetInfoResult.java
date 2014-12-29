package com.handstandtech.flickr.shared.model.people;

import com.handstandtech.flickr.shared.model.FlickrPerson;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
public class PeopleGetInfoResult implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private FlickrPerson person;
	
	private String stat;

}
