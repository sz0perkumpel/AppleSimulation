package com.applesimulation;

/**
 * Klasa dziedziczaca po pogodzie dla klimatu suchego
 */
public class DryClimate extends Weather {
    public Double droughtProbability;

    public DryClimate(Double airTemperature, Integer humidity, Double droughtProbability) {
        super(airTemperature, humidity, "Dry");
        this.droughtProbability = droughtProbability;
    }

    /**
     *  Metoda liczaca wspolczynnik pogodowy dla klimatu suchego
     */
    public Double growthRatio() {
        ProbabilityChecker checker = new ProbabilityChecker(droughtProbability);
        if (checker.success()) {
            return -0.3;
        } else {
            return super.growthRatio();
        }
    }

    /**
     * Metoda losujaca wartosci z zakresu danego klimatu dla kazdego kolejnego dnia
     */
    public DryClimate nextDay() {
        super.nextDay();
        this.humidity = this.humidity % 50;
        this.airTemperature = randomValue(25, 40).doubleValue();

        return this;
    }

}
