package org.example.implementation;

import org.example.api.Notification;

import java.util.logging.Level;
import java.util.logging.Logger;

import static java.lang.String.format;
import static java.util.logging.Level.INFO;

/**
 * Notification via email.
 */
public final class EmailNotification implements Notification {
    /**
     * {@link java.util.logging.Logger} instance.
     */
    private static final Logger LOG = Logger.getAnonymousLogger();
    private final String adminEmail;

    /**
     * Constructor.
     * <p/>
     *
     * @param adminEmail
     *          {@link java.lang.String} system administrator's email.
     */
    public EmailNotification(final String adminEmail) {
        this.adminEmail = adminEmail;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void send(final String title, final String message) {
        mail(adminEmail, title, message);
        LOG.log(INFO, format("Sent email with title '%s' to '%s' that says '%s'.", title, adminEmail, message));
    }

    private void mail(final String destination, final String title, final String message) {
        // performs actual email transfer
    }
}
