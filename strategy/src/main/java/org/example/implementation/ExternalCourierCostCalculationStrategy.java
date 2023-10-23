package org.example.implementation;

/**
 * Delivery cost calculation when delivery is performed by external courier.
 */
public final class ExternalCourierCostCalculationStrategy extends AbstractCostCalculationStrategy {
    /**
     * {@inheritDoc}
     */
    @Override
    public float getPickUpCost() {
        return 20;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public float getDeliveryCost(final float distance) {
        return 10;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public float getWaitCost(final float waitTime) {
        return 5;
    }
}
