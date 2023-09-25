package org.example.implementation;


import org.example.api.Notification;

import java.util.logging.Logger;

import static java.lang.String.format;
import static java.util.logging.Level.INFO;

/**
 * Notification via SMS.
 */
public final class SmsNotification implements Notification {
    /**
     * {@link java.util.logging.Logger} instance.
     */
    private static final Logger LOG = Logger.getAnonymousLogger();

    private final String phone;
    private final String sender;

    /**
     * Constructor.
     * <p/>
     *
     * @param phone  {@link java.lang.String} phone to send SMS to.
     * @param sender {@link java.lang.String} sender name.
     */
    public SmsNotification(final String phone, final String sender) {
        this.phone = phone;
        this.sender = sender;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void send(final String title, final String message) {
        sendSms(phone, sender, title, message);
        LOG.log(INFO, format("Sent SMS message with title '%s' to '%s' that says '%s'.", title, phone, message));
    }

    private void sendSms(final String phone, final String sender, final String title, final String message) {
        // send actual SMS
    }
}
