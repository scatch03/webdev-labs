package org.example.implementation.network;

import org.example.api.Credentials;
import org.example.api.AbstractSocialNetwork;
import org.example.implementation.credentials.FacebookCredentials;

/**
 * Facebook social network.
 */
public class Facebook extends AbstractSocialNetwork {

    @Override
    public Credentials getCredentials() {
       return new FacebookCredentials("fb_user_login", "P@$$w0rd");
    }
}
