package org.example;

import org.example.api.CostCalculationStrategy;
import org.example.api.Delivery;
import org.example.implementation.ExternalCourierCostCalculationStrategy;
import org.example.implementation.OwnCourierCostCalculationStrategy;
import org.example.implementation.SelfPickupCostCalculationStrategy;
import org.example.implementation.SimpleDelivery;

public class Main {
    public static void main(String[] args) {
        final CostCalculationStrategy selfPickUp = new SelfPickupCostCalculationStrategy();
        final CostCalculationStrategy ownCourier = new OwnCourierCostCalculationStrategy();
        final CostCalculationStrategy externalCourier = new ExternalCourierCostCalculationStrategy();

        final Delivery myDelivery = new SimpleDelivery(25, 2);

        myDelivery.setCostCalculationStrategy(selfPickUp);
        final float selfPickUpCost = myDelivery.getCost();

        myDelivery.setCostCalculationStrategy(ownCourier);
        final float ownCourierCost = myDelivery.getCost();

        myDelivery.setCostCalculationStrategy(externalCourier);
        final float externalCourierCost = myDelivery.getCost();

        System.out.printf("Self pickup: %.2f \nOwn courier: %.2f \nExternal courier: %.2f", selfPickUpCost, ownCourierCost, externalCourierCost);
    }
}
