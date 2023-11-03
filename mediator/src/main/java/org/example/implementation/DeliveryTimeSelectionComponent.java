package org.example.implementation;

import org.example.api.Mediator;

/**
 * Delivery time selection component.
 */
public final class DeliveryTimeSelectionComponent extends AbstractComponent {
    /**
     * {@inheritDoc}
     */
    public DeliveryTimeSelectionComponent(final Mediator mediator, final String name) {
        super(mediator, name);
    }

    void update(){
        System.out.printf("component[%s] updated\n", name);
    }
}
