package org.example.api;

/**
 * Authentication credentials.
 */
public interface Credentials {
    /**
     * Login value.
     *
     * @return {@link java.lang.String} login.
     */
    String getLogin();

    /**
     * Password value.
     *
     * @return {@link java.lang.String} password.
     */
    String getPassword();
}
