package org.example.implementation.network;

import org.example.api.Credentials;
import org.example.api.AbstractSocialNetwork;
import org.example.implementation.credentials.LinkedInCredentials;

/**
 * LinkedIn social network.
 */
public class LinkedIn extends AbstractSocialNetwork {

    @Override
    public Credentials getCredentials() {
        return new LinkedInCredentials("user@company.com", "P@$$w0rd");
    }
}
