package com.handstandtech.flickr.shared.model.content;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;
@Data
@NoArgsConstructor
public class FlickrTimeContent implements Serializable {

	/**
	 * Default Serialization UID
	 */
	private static final long serialVersionUID = 1L;

	private String _content;

	public Long getTime() {
		return Long.parseLong(_content);
	}
	
	public Date getDate() {
		Long time = getTime();
		System.out.println(time);
		Date date = new Date(time*1000L);
		System.out.println(date);
		return date;
	}

}
