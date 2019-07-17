package com.kodilla.patterns.strategy.publisher;

import com.kodilla.patterns.strategy.social.SocialPublisher;

public class TwitterPublisher implements SocialPublisher {
    @Override
    public String share() {
        return "publish on Twitter";
    }
}
