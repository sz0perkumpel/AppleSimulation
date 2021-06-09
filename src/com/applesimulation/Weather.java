package com.applesimulation;

import java.util.ArrayList;
import java.util.Random;

public class Weather {
    public Double airTemperature;
    public Integer humidity;
    public String typeOfClimate;
    public Random numberGenerator;

    public Weather(Double airTemperature, Integer humidity, String typeOfClimate) {
        this.airTemperature = airTemperature;
        this.humidity = humidity;
        this.typeOfClimate = typeOfClimate;
        this.numberGenerator = new Random();
    }

    public Double growthRatio() {
        return (airTemperature * humidity) / 10000;
    }

    public String toString() {
        ArrayList<String> result = new ArrayList<>();
        result.add("Air temperature: " + this.airTemperature + " 'C");
        result.add("Humidity: " + this.humidity + "%");
        result.add("Climate: " + this.typeOfClimate);

        return String.join("\n", result);
    }

    public Weather nextDay() {
        this.airTemperature = numberGenerator.nextDouble() * 100;
        this.humidity = numberGenerator.nextInt(100);

        return this;
    }

    public Integer randomValue(int minimum, int maximum) {
        int range = maximum - minimum + 1;
        return numberGenerator.nextInt(range) + minimum;
    }
}