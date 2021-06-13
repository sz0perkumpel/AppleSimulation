package com.applesimulation;

/**
 * Klasa dziedziczaca po pogodzie dla klimatu umiarkowanego
 */
public class ModerateClimate extends Weather {
    public Double heavyRainProbability;

    public ModerateClimate(Double airTemperature, Integer humidity, Double heavyRainProbability) {
        super(airTemperature, humidity, "Umiarkowany");
        this.heavyRainProbability = heavyRainProbability;
    }

    /**
     * Metoda liczaca wspolczynnik pogodowy dla klimatu umiarkowanego
     */
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

    /**
     * Metoda losujaca wartosci z zakresu danego klimatu dla kazdego kolejnego dnia
     */
    public ModerateClimate nextDay() {
        super.nextDay();
        this.humidity = randomValue(20, 60);
        this.airTemperature = randomValue(10, 28).doubleValue();

        return this;
    }
}
