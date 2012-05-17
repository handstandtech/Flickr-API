package com.handstandtech.flickr.server;

import oauth.signpost.OAuthConsumer;
import oauth.signpost.OAuthProvider;
import oauth.signpost.basic.DefaultOAuthProvider;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.handstandtech.flickr.shared.model.FlickrPerson;
import com.handstandtech.flickr.shared.model.FlickrPhotoset;
import com.handstandtech.flickr.shared.model.FlickrPhotosetInfos;
import com.handstandtech.flickr.shared.model.FlickrUser;
import com.handstandtech.flickr.shared.model.places.FlickrPlace;
import com.handstandtech.restclient.server.RESTClient;
import com.handstandtech.restclient.server.RESTClientProvider;
import com.handstandtech.restclient.server.auth.Authenticator;
import com.handstandtech.restclient.server.auth.oauth.OAuthAuthenticatorProvider;
import com.handstandtech.restclient.server.model.RESTRequest;
import com.handstandtech.restclient.shared.model.RESTResult;

public class FlickrHelper {

	private static final Logger log = LoggerFactory.getLogger(FlickrHelper.class);

	private static final String BASE_OAUTH_URL = "http://www.flickr.com/services/oauth/";

	protected OAuthConsumer consumer;
	protected RESTClientProvider restProvider;
	protected OAuthAuthenticatorProvider oAuthProvider;

	public FlickrHelper(OAuthConsumer consumer, RESTClientProvider restProvider, OAuthAuthenticatorProvider oAuthProvider) {
		this.consumer = consumer;
		this.restProvider = restProvider;
		this.oAuthProvider = oAuthProvider;
	}

	

	public FlickrHelper(OAuthConsumer consumer, String token, String tokenSecret, RESTClientProvider restProvider, OAuthAuthenticatorProvider oAuthProvider) {
		this.consumer = consumer;
		this.consumer.setTokenWithSecret(token, tokenSecret);
		this.restProvider = restProvider;
		this.oAuthProvider = oAuthProvider;
	}
	
	public String getAPIKey() {
		return consumer.getConsumerKey();
	}

	private Authenticator getAuthenticator() {
		Authenticator a = null;
		if (consumer != null) {
			a = oAuthProvider.getAuthenticator(consumer);
		}
		return a;
	}

	public FlickrUser people_searchByEmail(String email) {
		RESTRequest restRequest = FlickrRESTRequestBuilder.people_searchByEmail(email, getAuthenticator(), getAPIKey());
		RESTClient client = createRESTClientInstance();
		RESTResult restResult = client.request(restRequest);
		log.info(restResult.toString());
		return FlickrUtils.getSearchByEmailResult(restResult);
	}

	private RESTClient createRESTClientInstance() {
		return restProvider.getNewClientInstance();
	}

	public FlickrPhotosetInfos photosets_getList(String user_id) {
		RESTRequest restRequest = FlickrRESTRequestBuilder.photosets_getList(user_id, getAuthenticator(), getAPIKey());
		RESTClient client = createRESTClientInstance();
		RESTResult restResult = client.request(restRequest);
		log.info(restResult.toString());
		return FlickrUtils.getPhotosetInfosFromResult(restResult);
	}

	public FlickrPlace places_getInfo(String place_id) {
		RESTRequest restRequest = FlickrRESTRequestBuilder.places_getInfo(place_id, getAuthenticator(), getAPIKey());
		RESTClient client = createRESTClientInstance();
		RESTResult restResult = client.request(restRequest);
		log.info(restResult.toString());
		return FlickrUtils.getPlacesInfoFromResult(restResult);
	}

	public FlickrPhotoset photosets_getPhotos(String photoset_id) {
		RESTRequest restRequest = FlickrRESTRequestBuilder.photosets_getPhotos(photoset_id, getAuthenticator(), getAPIKey());
		RESTClient client = createRESTClientInstance();
		RESTResult restResult = client.request(restRequest);
		log.info(restResult.toString());
		return FlickrUtils.getPhotosetFromResult(restResult);
	}

	public FlickrPerson people_getInfo(String id) {
		RESTRequest restRequest = FlickrRESTRequestBuilder.people_getInfo(id, getAuthenticator(), getAPIKey());
		RESTClient client = createRESTClientInstance();
		RESTResult restResult = client.request(restRequest);
		log.info(restResult.toString());
		return FlickrUtils.getPersonFromResult(restResult);
	}

	public FlickrUser test_login() {
		RESTRequest restRequest = FlickrRESTRequestBuilder.test_login(getAuthenticator(), getAPIKey());
		RESTClient client = createRESTClientInstance();
		RESTResult restResult = client.request(restRequest);
		log.info(restResult.toString());
		return FlickrUtils.getFlickrUserFromResult(restResult);
	}

	public static OAuthProvider getFlickrOAuthProvider(FlickrPerm perms) {
		OAuthProvider provider = new DefaultOAuthProvider(BASE_OAUTH_URL + "request_token", BASE_OAUTH_URL + "access_token", BASE_OAUTH_URL + "authorize?perms=" + perms.getValue());
		return provider;
	}

	public void setTokenAndSecret(String token, String tokenSecret) {
		consumer.setTokenWithSecret(token, tokenSecret);
	}

}
