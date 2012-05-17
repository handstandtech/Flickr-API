package com.handstandtech.flickr.server;

public enum FlickrPerm {
	READ("read"), WRITE("write"), DELETE("delete");

	private String value;

	private FlickrPerm(String value) {
		this.setValue(value);
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
}
