package org.example.api;

/**
 * General renderer interface.
 */
public interface Renderer {
    /**
     * Start rendering.
     */
    void start();

    /**
     * Write data.
     *
     * @param field
     *          {@link java.lang.String} data field name.
     * @param value
     *          {@link java.lang.Object} data value.
     */
    void write(final String field, final Object value);

    /**
     * Finish rendering.
     */
    void end();
}
