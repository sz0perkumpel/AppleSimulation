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
            return 0.0;
        } else {
            return super.growthRatio();
        }
    }

}
