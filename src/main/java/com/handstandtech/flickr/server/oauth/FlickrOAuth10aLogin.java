package com.handstandtech.flickr.server.oauth;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import oauth.signpost.OAuthConsumer;
import oauth.signpost.OAuthProvider;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Sam Edwards
 */
@SuppressWarnings("serial")
public abstract class FlickrOAuth10aLogin extends HttpServlet {

	private static Logger log = LoggerFactory.getLogger(FlickrOAuth10aLogin.class.getName());

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		log.info("Flickr OAuth Login...");
		try {

			OAuthConsumer consumer = getOAuthConsumer(request);
			log.info("Consumer Key: " + consumer.getConsumerKey());
			log.info("Consumer Secret: " + consumer.getConsumerSecret());

			OAuthProvider provider = getOAuthProvider(request);

			String authUrl = provider.retrieveRequestToken(consumer, getCallbackUrl(request));
			handleUpdatedConsumer(request, consumer);

			log.debug("Fetching request token from Flickr. Auth URL: " + authUrl);
			response.sendRedirect(authUrl);
		} catch (Exception e) {
			e.printStackTrace();
			log.error(e.getMessage(), e);
		}
	}

	protected abstract void handleUpdatedConsumer(HttpServletRequest request, OAuthConsumer consumer);

	protected abstract OAuthProvider getOAuthProvider(HttpServletRequest request);

	protected abstract String getCallbackUrl(HttpServletRequest request);

	protected abstract OAuthConsumer getOAuthConsumer(HttpServletRequest request);
}
