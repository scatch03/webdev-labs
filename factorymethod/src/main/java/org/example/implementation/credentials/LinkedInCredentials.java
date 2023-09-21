package org.example.implementation.credentials;

import org.example.api.Credentials;

/**
 * LinkedIn credentials.
 */
public class LinkedInCredentials implements Credentials {
    private final String email;
    private final String password;

    public LinkedInCredentials(final String email, final String password) {
        this.email = email;
        this.password = password;
    }

    @Override
    public String getLogin() {
        return email;
    }

    @Override
    public String getPassword() {
        return password;
    }
}
