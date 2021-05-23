package com.applesimulation;

public class ModerateClimate extends Weather {
    public Double heavyRainProbability;

    public ModerateClimate(Double airTemperature, Integer humidity, Double heavyRainProbability) {
        super(airTemperature, humidity, "Moderate");
        this.heavyRainProbability = heavyRainProbability;
    }

    public Double growthRatio() {
        ProbabilityChecker checker = new ProbabilityChecker(heavyRainProbability);
        if (checker.success() && humidity > 50) {
            return super.growthRatio() * 0.8;
        } else if (checker.success() && humidity <= 50) {
            return super.growthRatio() * 1.2;
        } else {
            return super.growthRatio();
        }
    }
}
