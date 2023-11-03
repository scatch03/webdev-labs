package org.example.implementation;

import org.example.api.Mediator;

import static java.lang.String.format;

/**
 * General component abstraction.
 */
public abstract class AbstractComponent {
    /**
     * {@link Mediator} instance.
     */
    protected final Mediator mediator;
    /**
     * {@link java.lang.String} component name.
     */
    protected final String name;

    /**
     * Constructor.
     * <p/>
     *
     * @param mediator {@link Mediator} instance.
     */
    public AbstractComponent(final Mediator mediator, final String name) {
        this.mediator = mediator;
        this.name = name;
    }

    /**
     * Enables component.
     */
    public void enable() {
        System.out.printf("component[%s] enabled%n", name);
    }

    /**
     * Disables component.
     */
    public void disable() {
        System.out.printf("component[%s] disabled%n", name);
    }
}
