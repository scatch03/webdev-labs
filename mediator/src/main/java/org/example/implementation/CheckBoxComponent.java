package org.example.implementation;

import org.example.api.Mediator;

/**
 * Checkbox component.
 */
public final class CheckBoxComponent extends AbstractComponent {
    /**
     * {@inheritDoc}
     */
    public CheckBoxComponent(final Mediator mediator, final String name) {
        super(mediator, name);
    }

    /**
     * Process check event.
     */
    public void check() {
        System.out.printf("component[%s] checked\n", name);
        mediator.notify(this, "check");
    }

    /**
     * Process check event.
     */
    public void unCheck() {
        System.out.printf("component[%s] unChecked\n", name);
        mediator.notify(this, "unCheck");
    }
}
