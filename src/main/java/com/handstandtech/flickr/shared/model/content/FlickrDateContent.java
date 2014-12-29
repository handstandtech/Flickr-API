package com.handstandtech.flickr.shared.model.content;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;
@Data
@NoArgsConstructor
public class FlickrDateContent implements Serializable {

	private static final long serialVersionUID = 1L;

	private Date _content;
	
	public Date getDate() {
		return _content;
	}

}
