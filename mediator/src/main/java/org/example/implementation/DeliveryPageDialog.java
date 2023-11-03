package org.example.implementation;

import org.example.api.Mediator;

/**
 * Mediator for delivery page components.
 */
public class DeliveryPageDialog implements Mediator {
    /**
     * {@link DateTimePickerComponent} instance.
     */
    private final DateTimePickerComponent dateTimePicker =
            new DateTimePickerComponent(this, "DateTimePicker");
    /**
     * {@link CheckBoxComponent} to mark delivery for other person.
     */
    private final CheckBoxComponent deliveryForOtherPerson =
            new CheckBoxComponent(this, "DeliveryForOtherPerson");
    /**
     * {@link CheckBoxComponent} user will pick up delivery by himself.
     */
    private final CheckBoxComponent selfPickUp = new CheckBoxComponent(this, "SelfPickUp");
    /**
     * {@link TextBoxComponent} name for delivery to other person.
     */
    private final TextBoxComponent nameInput = new TextBoxComponent(this, "NameInput");
    /**
     * {@link TextBoxComponent} phone for delivery to other person.
     */
    private final TextBoxComponent phoneInput = new TextBoxComponent(this, "PhoneInput");
    /**
     * {@link DeliveryTimeSelectionComponent} for selecting delivery time.
     */
    private final DeliveryTimeSelectionComponent deliveryTimeSelect =
            new DeliveryTimeSelectionComponent(this, "DeliveryTimeSelect");

    /**
     * {@inheritDoc}
     */
    @Override
    public void notify(final AbstractComponent sender, final String event) {
        if (sender == dateTimePicker) {
            switch (event) {
                case "selectDate":
                    deliveryTimeSelect.update();
                    break;
                default:
                    throw new IllegalArgumentException("Unknown event: " + event);
            }
        }

        if (sender == deliveryForOtherPerson) {
            switch (event) {
                case "check":
                    nameInput.enable();
                    phoneInput.enable();
                    break;
                case "unCheck":
                    nameInput.disable();
                    phoneInput.disable();
                    break;
                default:
                    throw new IllegalArgumentException("Unknown event: " + event);
            }
        }

        if (sender == selfPickUp) {
            switch (event) {
                case "check":
                    deliveryForOtherPerson.enable();
                    dateTimePicker.enable();
                    deliveryTimeSelect.enable();
                    break;
                case "unCheck":
                    deliveryForOtherPerson.disable();
                    dateTimePicker.disable();
                    deliveryTimeSelect.disable();
                    break;
                default:
                    throw new IllegalArgumentException("Unknown event: " + event);
            }
        }
    }

    public DateTimePickerComponent getDateTimePicker() {
        return dateTimePicker;
    }

    public CheckBoxComponent getDeliveryForOtherPerson() {
        return deliveryForOtherPerson;
    }

    public CheckBoxComponent getSelfPickUp() {
        return selfPickUp;
    }
}
