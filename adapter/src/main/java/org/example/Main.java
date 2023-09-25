package org.example;

import org.example.api.Notification;
import org.example.implementation.EmailNotification;
import org.example.implementation.SlackNotification;
import org.example.implementation.SmsNotification;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        final List<Notification> notifications = Arrays.asList(
                new EmailNotification("admin@provider.com"),
                new SlackNotification("sp@mm3r", "dfsa9e$d1gT", "gamers"),
                new SmsNotification("+360971112201", "nigerian_prince")
        );

        for (final Notification notification : notifications) {
            notification.send("You Won!", "Click following link to claim Your prize: http://bit.ly/AxcZ");
        }
    }
}
