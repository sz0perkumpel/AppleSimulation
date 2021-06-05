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
            return super.growthRatio() * -2;
        } else if (checker.success() && humidity <= 50) {
            return super.growthRatio() * 1.2;
        } else {
            return super.growthRatio();
        }
    }

    public ModerateClimate nextDay() {
        super.nextDay();
        this.humidity = randomValue(20, 60);
        this.airTemperature = randomValue(10, 28).doubleValue();

        return this;
    }
}
