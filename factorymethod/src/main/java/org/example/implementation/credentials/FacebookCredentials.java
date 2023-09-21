package org.example.implementation.credentials;

import org.example.api.Credentials;

/**
 * Facebook credentials.
 */
public class FacebookCredentials implements Credentials {
    private final String login;
    private final String password;

    public FacebookCredentials(final String login, final String password) {
        this.login = login;
        this.password = password;
    }

    @Override
    public String getLogin() {
        return login;
    }

    @Override
    public String getPassword() {
        return password;
    }
}
