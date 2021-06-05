package com.applesimulation;

public class DryClimate extends Weather {
    public Double droughtProbability;

    public DryClimate(Double airTemperature, Integer humidity, Double droughtProbability) {
        super(airTemperature, humidity, "Dry");
        this.droughtProbability = droughtProbability;
    }

    public Double growthRatio() {
        ProbabilityChecker checker = new ProbabilityChecker(droughtProbability);
        if (checker.success()) {
            return -0.3;
        } else {
            return super.growthRatio();
        }
    }

    public DryClimate nextDay() {
        super.nextDay();
        this.humidity = this.humidity % 50;
        this.airTemperature = randomValue(25, 40).doubleValue();

        return this;
    }

}
