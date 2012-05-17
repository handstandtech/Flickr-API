package com.handstandtech.flickr.server;

public enum FlickrSafetyLevel {
	SAFE(1), MODERATE(2), RESTRICTED(3);

	private int value;

	private FlickrSafetyLevel(int value) {
		this.setValue(value);
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

}
