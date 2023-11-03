package org.example.api;

import org.example.implementation.AbstractComponent;

/**
 * General mediator interface.
 */
public interface Mediator {

    /**
     * Notify mediator.
     * <p/>
     *
     * @param sender {@link AbstractComponent} notification sender.
     * @param event  {@link String} event name.
     */
    void notify(AbstractComponent sender, String event);
}
