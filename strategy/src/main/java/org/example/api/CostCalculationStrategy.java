package org.example.api;

/**
 * General contract for delivery cost calculation.
 */
public interface CostCalculationStrategy {
    /**
     * Get delivery pickup cost.
     * <p/>
     *
     * @return {@code float} delivery pickup cost.
     */
    float getPickUpCost();

    /**
     * Get delivery transportation cost.
     * <p/>
     *
     * @param distance {@code float} delivery distance.
     * @return {@code float} delivery transportation cost.
     */
    float getDeliveryCost(float distance);

    /**
     * Get cost in case if delivery cannot be accepted immediately.
     * <p/>
     *
     * @param waitTime {@code float} delivery waiting time.
     * @return {@code float} wait cost.
     */
    float getWaitCost(float waitTime);

    /**
     * Get total delivery cost.
     * <p/>
     *
     * @param distance {@code float} delivery distance.
     * @param waitTime {@code float} delivery waiting time.
     * @return {@code float} total cost.
     */
    float getTotalCost(float distance, float waitTime);
}
