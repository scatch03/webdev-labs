package org.example.implementation;

import org.example.api.CostCalculationStrategy;
import org.example.api.Delivery;

/**
 * Simple delivery.
 */
public final class SimpleDelivery implements Delivery {
    private final float distance;
    private final float waitTime;
    /**
     * {@link CostCalculationStrategy} instance.
     */
    private CostCalculationStrategy strategy;

    /**
     * Constructor.
     */
    public SimpleDelivery(final float distance, final float waitTime) {
        this.distance = distance;
        this.waitTime = waitTime;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void setCostCalculationStrategy(final CostCalculationStrategy strategy) {
        this.strategy = strategy;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public float getCost() {
        return strategy.getTotalCost(distance, waitTime);
    }
}
