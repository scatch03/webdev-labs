package org.example.api;

/**
 * Delivery contact.
 */
public interface Delivery {

    /**
     * Set delivery cost calculating strategy.
     * <p/>
     *
     * @param strategy {@link CostCalculationStrategy} instance.
     */
    void setCostCalculationStrategy(CostCalculationStrategy strategy);

    /**
     * Get delivery cost.
     * <p/>
     *
     * @return {@code float} delivery cost.
     */
    float getCost();
}
