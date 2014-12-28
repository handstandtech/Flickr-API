package com.handstandtech.flickr.server;

import com.handstandtech.restclient.server.auth.Authenticator;
import com.handstandtech.restclient.server.model.RESTRequest;
import com.handstandtech.restclient.shared.model.RequestMethod;
import com.handstandtech.restclient.shared.util.RESTURLUtil;

import java.util.HashMap;
import java.util.Map;

public class FlickrRESTRequestBuilder {
	private static final String BASE_URL = "https://api.flickr.com/services/rest/";

	public static RESTRequest people_searchByEmail(String email, Authenticator auth, String apiKey) {

		Map<String, String> params = getBaseParams(apiKey);
		params.put("method", "flickr.people.findByEmail");
		params.put("find_email", email);

		String url = RESTURLUtil.createFullUrl(BASE_URL, params);

		return new RESTRequest(RequestMethod.GET, url, auth);

	}

	public static RESTRequest photosets_getList(String user_id, Authenticator auth, String apiKey) {

		Map<String, String> params = getBaseParams(apiKey);
		params.put("method", "flickr.photosets.getList");
		if (user_id != null) {
			params.put("user_id", user_id);
		}

		String url = RESTURLUtil.createFullUrl(BASE_URL, params);

		return new RESTRequest(RequestMethod.GET, url, auth);
	}

	public static RESTRequest places_getInfo(String place_id, Authenticator auth, String apiKey) {

		Map<String, String> params = getBaseParams(apiKey);
		params.put("method", "flickr.places.getInfo");
		params.put("place_id", place_id);

		String url = RESTURLUtil.createFullUrl(BASE_URL, params);

		return new RESTRequest(RequestMethod.GET, url, auth);

	}

	public static RESTRequest photosets_getPhotos(String photoset_id, Authenticator auth, String apiKey) {
		Map<String, String> params = getBaseParams(apiKey);
		params.put("method", "flickr.photosets.getPhotos");
		params.put("photoset_id", photoset_id);
		params.put("extras", "geo,date_taken,last_update,url_sq,url_t,url_s,url_m,url_o");

		// Privacy Filter is Off (We can see private photos)
		params.put("privacy_filter", "0");

		String url = RESTURLUtil.createFullUrl(BASE_URL, params);

		return new RESTRequest(RequestMethod.GET, url, auth);

	}

	public static RESTRequest people_getInfo(String id, Authenticator auth, String apiKey) {
		Map<String, String> params = getBaseParams(apiKey);
		params.put("method", "flickr.people.getInfo");
		params.put("user_id", id);

		return new RESTRequest(RequestMethod.GET, BASE_URL, auth);
	}

	private static Map<String, String> getBaseParams(String apiKey) {
		Map<String, String> params = new HashMap<String, String>();
		params.put("format", "json");
		params.put("nojsoncallback", "1");
		params.put("apiKey", apiKey);
		return params;
	}

	public static RESTRequest test_login(Authenticator auth, String apiKey) {

		Map<String, String> params = getBaseParams(apiKey);
		params.put("method", "flickr.test.login");

		String url = RESTURLUtil.createFullUrl(BASE_URL, params);
		return new RESTRequest(RequestMethod.GET, url, auth);
	}
}
