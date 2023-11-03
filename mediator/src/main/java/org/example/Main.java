package org.example;

import org.example.implementation.DeliveryPageDialog;

public class Main {

    public static void main(final String[] args) {
        final DeliveryPageDialog dialog = new DeliveryPageDialog();

        dialog.getDateTimePicker().selectDate();
        System.out.println("--------------------------------------------------------------------------------------------");

        dialog.getDeliveryForOtherPerson().check();
        dialog.getDeliveryForOtherPerson().unCheck();
        System.out.println("--------------------------------------------------------------------------------------------");

        dialog.getSelfPickUp().check();
        dialog.getSelfPickUp().unCheck();
    }
}
