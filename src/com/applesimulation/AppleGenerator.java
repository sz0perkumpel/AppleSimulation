package com.applesimulation;

import java.util.Random;

public class AppleGenerator {
    public Random numberGenerator;

    public AppleGenerator() {
        this.numberGenerator = new Random();
    }

    public Apple generate() {
        return new Apple(generateNumber(), generateNumber());
    }

    private Integer generateNumber() {
        return this.numberGenerator.nextInt(101);
    }
}
