package com.applesimulation;

import java.util.Random;

public class AppleTreeGenerator {
    public Random numberGenerator;

    public AppleTreeGenerator() {
        this.numberGenerator = new Random();
    }

    public AppleTree generate() {
        AppleTree appleTree = new AppleTree(generateNumber(), generateNumber());
        AppleGenerator appleGenerator = new AppleGenerator();
        int numberOfApples = generateNumber();
        for (int i = 0; i < numberOfApples; i++) {
            appleTree.addApple(appleGenerator.generate());
        }
        return appleTree;
    }

    private Integer generateNumber() {
        return this.numberGenerator.nextInt(101);
    }
}
