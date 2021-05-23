package com.applesimulation;

import java.util.Random;

public class ProbabilityChecker {
    public Random numberGenerator;
    public Double probability;

    public ProbabilityChecker(Double probability) {
        this.probability = probability;
        this.numberGenerator = new Random();
    }

    public Boolean success() {
        return numberGenerator.nextDouble() < probability;
    }
}
