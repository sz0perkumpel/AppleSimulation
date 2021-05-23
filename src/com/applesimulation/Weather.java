package com.applesimulation;

import java.util.ArrayList;

public class Weather {
    public Double airTemperature;
    public Integer humidity;
    public String typeOfClimate;

    public Weather(Double airTemperature, Integer humidity, String typeOfClimate) {
        this.airTemperature = airTemperature;
        this.humidity = humidity;
        this.typeOfClimate = typeOfClimate;
    }

    public Double growthRatio() {
        return (airTemperature * humidity) / 10000;
    }

    public String toString() {
        ArrayList<String> result = new ArrayList<>();
        result.add("Air temperature: " + this.airTemperature + " 'C");
        result.add("Humidity: " + this.humidity + "%");
        result.add("Climate: " + this.typeOfClimate);

        return String.join("\n", result) + "\n";
    }
}