package com.kodilla.kodilla.patterns2.facade;

import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class Authenticator {

    public boolean isAuthethenticated(Long userId) {

        Random random = new Random();
        return random.nextBoolean();
    }
}
