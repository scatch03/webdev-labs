package org.example.implementation;

/**
 * Delivery cost calculation if customer picks up delivery by himself.
 */
public final class SelfPickupCostCalculationStrategy extends AbstractCostCalculationStrategy {
    /**
     * {@inheritDoc}
     */
    @Override
    public float getPickUpCost() {
        return 0;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public float getDeliveryCost(final float distance) {
        return 0;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public float getWaitCost(final float waitTime) {
        return 0;
    }
}
