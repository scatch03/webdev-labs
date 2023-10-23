package org.example.implementation;

/**
 * Delivery cost calculation when delivery is performed by own courier.
 */
public final class OwnCourierCostCalculationStrategy extends AbstractCostCalculationStrategy {
    /**
     * {@inheritDoc}
     */
    @Override
    public float getPickUpCost() {
        return 10;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public float getDeliveryCost(final float distance) {
        return 5;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public float getWaitCost(final float waitTime) {
        return 0;
    }
}
