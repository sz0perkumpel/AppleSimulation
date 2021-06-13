package com.applesimulation;

/**
 * Klasa dziedziczaca po pogodzie dla klimatu zimnego
 */
public class ColdClimate extends Weather {
    public Double snowProbability;

    public ColdClimate(Double airTemperature, Integer humidity, Double snowProbability) {
        super(airTemperature, humidity, "Zimny");
        this.snowProbability = snowProbability;
    }

    /**
     * Metoda liczaca wspolczynnik pogodowy dla klimatu zimnego
     */
    public Double growthRatio() {
        ProbabilityChecker checker = new ProbabilityChecker(snowProbability);
        if (checker.success()) {
            return super.growthRatio() * -10;
        } else {
            return super.growthRatio();
        }
    }

    /**
     * Metoda losujaca wartosci z zakresu danego klimatu dla kazdego kolejnego dnia
     */
    public ColdClimate nextDay() {
        super.nextDay();
        this.humidity = randomValue(0, 30);
        this.airTemperature = randomValue(4, 15).doubleValue();

        return this;
    }
}
