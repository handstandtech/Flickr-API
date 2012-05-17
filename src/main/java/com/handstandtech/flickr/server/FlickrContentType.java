package com.handstandtech.flickr.server;

public enum FlickrContentType {
	PHOTO(1), SCREENSHOT(2), OTHER(3);

	private int value;

	private FlickrContentType(int value) {
		this.setValue(value);
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

}
