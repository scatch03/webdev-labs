package org.example.api;

/**
 * General social network abstraction.
 */
public abstract class AbstractSocialNetwork {

    public abstract Credentials getCredentials();

    public void createPost(final String message) {
        final Credentials credentials = getCredentials();
        login(credentials.getLogin(), credentials.getPassword());
        post(message);
    }

    private void login(final String login, final String password) {
        // perform login
    }

    private void post(final String message) {
        // post message to network
    }
}
