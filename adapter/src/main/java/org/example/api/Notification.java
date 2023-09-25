package org.example.api;

/**
 * General notification contract.
 */
public interface Notification {
    /**
     * Send notification with a given title and message.
     * <p/>
     *
     * @param title   {@link java.lang.String} message title.
     * @param message {@link String} actual message.
     */
    void send(String title, String message);
}
