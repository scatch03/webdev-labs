package org.example.implementation;

import org.example.api.Notification;

import java.util.logging.Logger;

import static java.lang.String.format;
import static java.util.logging.Level.INFO;

/**
 * Notification via Slack messenger.
 */
public final class SlackNotification implements Notification {
    /**
     * {@link java.util.logging.Logger} instance.
     */
    private static final Logger LOG = Logger.getAnonymousLogger();
    private final String login;
    private final String apiKey;
    private final String chatId;

    /**
     * Constructor.
     * <p/>
     *
     * @param login
     *          {@link java.lang.String} login value.
     * @param apiKey
     *          {@link String} slack account API key.
     * @param chatId
     *          {@link java.lang.String} channel to post data into.
     */
    public SlackNotification(final String login, final String apiKey, final String chatId) {
        this.login = login;
        this.apiKey = apiKey;
        this.chatId = chatId;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void send(final String title, final String message) {
        authorize(login, apiKey);
        sendSlackMessage(chatId, title, message);
        LOG.log(INFO, format("Sent Slack message with title '%s' to '%s' that says '%s'.", title, chatId, message));
    }

    private void sendSlackMessage(final String chatId, final String title, final String message) {
        // send message to a given Slack chat
    }

    private void authorize(final String login, final String apiKey) {
        // perform Slack authorization.
    }
}
