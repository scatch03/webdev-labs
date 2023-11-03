package org.example.implementation;

import org.example.api.Mediator;

/**
 * Component for picking date and time.
 */
public final class DateTimePickerComponent extends AbstractComponent {
    /**
     * {@inheritDoc}
     */
    public DateTimePickerComponent(final Mediator mediator, final String name) {
        super(mediator, name);
    }

    /**
     * Process date selection.
     */
    public void selectDate() {
        System.out.printf("component[%s] selected date\n", name);
        mediator.notify(this, "selectDate");
    }
}
