package com.handstandtech.flickr.server.oauth;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import oauth.signpost.OAuthConsumer;
import oauth.signpost.OAuthProvider;
import oauth.signpost.exception.OAuthCommunicationException;
import oauth.signpost.exception.OAuthExpectationFailedException;
import oauth.signpost.exception.OAuthMessageSignerException;
import oauth.signpost.exception.OAuthNotAuthorizedException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.handstandtech.flickr.server.FlickrHelper;
import com.handstandtech.flickr.server.FlickrPerm;

/**
 * An Abstract Flickr OAuth callback handler.
 * 
 * @author Sam Edwards
 */
@SuppressWarnings("serial")
public abstract class FlickrOAuth10aCallback extends HttpServlet {

	private static Logger log = LoggerFactory.getLogger(FlickrOAuth10aCallback.class.getName());

	/**
	 * Exchange an OAuth request token for an access token, and store the latter
	 * in cookies.
	 */
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		log.debug("Callback, Flickr.");

		try {
			String oauth_verifier = request.getParameter("oauth_verifier");
			log.debug("OAuth Verifier: " + oauth_verifier);

			OAuthConsumer consumer = getOAuthConsumer(request);
			OAuthProvider provider = FlickrHelper.getFlickrOAuthProvider(FlickrPerm.WRITE);

			provider.setOAuth10a(true);
			provider.retrieveAccessToken(consumer, oauth_verifier);

			handleConsumerWithToken(request, response, consumer);

		} catch (OAuthMessageSignerException e) {
			e.printStackTrace();
		} catch (OAuthExpectationFailedException e) {
			e.printStackTrace();
		} catch (OAuthCommunicationException e) {
			e.printStackTrace();
		} catch (OAuthNotAuthorizedException e) {
			e.printStackTrace();
		}
	}

	protected abstract void handleConsumerWithToken(HttpServletRequest request, HttpServletResponse response, OAuthConsumer consumer) throws IOException;

	protected abstract OAuthConsumer getOAuthConsumer(HttpServletRequest request);
}
