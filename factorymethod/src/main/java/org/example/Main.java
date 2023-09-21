package org.example;

import org.example.api.AbstractSocialNetwork;
import org.example.implementation.network.Facebook;
import org.example.implementation.network.LinkedIn;

public class Main {
    public static void main(String[] args) {
        AbstractSocialNetwork network = new LinkedIn();
        network.createPost("LinkedIn post");

        network = new Facebook();
        network.createPost("Facebook post");
    }
}
