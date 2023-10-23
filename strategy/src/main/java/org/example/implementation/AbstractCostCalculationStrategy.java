package org.example.implementation;

import org.example.api.CostCalculationStrategy;

/**
 * Basic cost calculation strategy.
 */
public abstract class AbstractCostCalculationStrategy implements CostCalculationStrategy {

    /**
     * {@inheritDoc}
     */
    @Override
    public float getTotalCost(float distance, float waitTime) {
        return getPickUpCost() + getDeliveryCost(distance) + getWaitCost(waitTime);
    }
}


