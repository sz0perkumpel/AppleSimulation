package com.applesimulation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test jednostkowy dla metod z klasy Soil
 */
class SoilTest {

    @Test
    void growthRatioWithGoodPH() {
        Soil soil = new Soil(6.0, false);
        assertEquals(0.1, soil.growthRatio());
    }

    @Test
    void growthRatioWithGoodPHAndGoodFertilizer() {
        Soil soil = new Soil(6.0, true);
        assertEquals(0.17, soil.growthRatio());
    }

    @Test
    void growthRatioWithBadPHAndGoodFertilizer() {
        Soil soil = new Soil(4.0, true);
        assertEquals(0.12, soil.growthRatio(), 0.001);
    }

    @Test
    void growthRatioWithBadPHAndNoFertilizer() {
        Soil soil = new Soil(4.0, false);
        assertEquals(0.05, soil.growthRatio(), 0.001);
    }
}