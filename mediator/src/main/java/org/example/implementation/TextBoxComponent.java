package org.example.implementation;

import org.example.api.Mediator;

/**
 * Component for text input.
 */
public final class TextBoxComponent extends AbstractComponent {
    /**
     * {@inheritDoc}
     */
    public TextBoxComponent(final Mediator mediator, final String name) {
        super(mediator, name);
    }
}
