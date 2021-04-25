package com.applesimulation;

import java.util.ArrayList;

public class Weather {
    public Double airTemperature;
    public Integer humidity;
    public String sun;
    public Integer percentageInsolation;
    public Integer percentageCloudy;
    public Integer probabilityWind;
    public Double windSpeed;
    public Integer probabilityRain;
    public Integer probabilitySnow;
    public Integer probabilityPests;

    public Weather(Double airTemperature, Integer humidity, String sun, Integer percentageInsolation, Integer percentageCloudy, Integer probabilityWind, Double windSpeed, Integer probabilityRain, Integer probabilitySnow, Integer probabilityPests) {
        this.airTemperature= airTemperature;
        this.humidity= humidity;
        this.sun = sun;
        this.percentageInsolation= percentageInsolation;
        this.percentageCloudy = percentageCloudy;
        this.probabilityWind = probabilityWind;
        this.windSpeed = windSpeed;
        this.probabilityRain = probabilityRain;
        this.probabilitySnow = probabilitySnow;
        this.probabilityPests = probabilityPests;
    }

    public String toString() {
        ArrayList<String> result = new ArrayList<>();
        result.add("Air temperature: " + this.airTemperature + " 'C");
        result.add("Humidity: " + this.humidity + "%");
        result.add("Sun: " + this.sun);
        result.add("Percentage of insolation: " + this.percentageInsolation + "%");
        result.add("Percentage of cloudy: " + this.percentageCloudy + "%");
        result.add("Probability and speed of wind: " + this.probabilityWind + "%" + " , " + this.windSpeed + " m/s");
        result.add("Probability of rain: " + this.probabilityRain + "%");
        result.add("Probability of snow: " + this.probabilitySnow + "%");
        result.add("Probability of pests: " + this.probabilityPests + "%");

        return String.join("\n", result) + "\n";
    }
}