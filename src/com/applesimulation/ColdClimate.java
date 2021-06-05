package com.applesimulation;

public class ColdClimate extends Weather {
    public Double snowProbability;

    public ColdClimate(Double airTemperature, Integer humidity, Double snowProbability) {
        super(airTemperature, humidity, "Cold");
        this.snowProbability = snowProbability;
    }

    public Double growthRatio() {
        ProbabilityChecker checker = new ProbabilityChecker(snowProbability);
        if (checker.success()) {
            return super.growthRatio() * -10;
        } else {
            return super.growthRatio();
        }
    }

    public ColdClimate nextDay() {
        super.nextDay();
        this.humidity = randomValue(0, 30);
        this.airTemperature = randomValue(4, 15).doubleValue();

        return this;
    }
}
