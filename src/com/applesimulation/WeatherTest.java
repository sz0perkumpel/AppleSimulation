package com.applesimulation;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test jednostkowy dla metod z Weather (rozne rodzaje wspolczynnika)
 */
class WeatherTest {
    private final Weather weather = new Weather(25.0, 20, "testowy");

    @org.junit.jupiter.api.Test
    void growthRatio() {
        assertEquals(0.05, weather.growthRatio());
    }

    @org.junit.jupiter.api.Test
    void testToString() {
        String expected = "Air temperature: 25.0 'C" + "\n" + "Humidity: 20%" + "\n" + "Climate: testowy";
        assertEquals(expected, weather.toString());
    }

    @org.junit.jupiter.api.Test
    void nextDay() {
        Weather newWeather = weather.nextDay();
        assertNotEquals(newWeather.airTemperature, 25.0);
        assertNotEquals(newWeather.humidity, 20);
    }
}