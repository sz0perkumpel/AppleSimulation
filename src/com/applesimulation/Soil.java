package com.applesimulation;

import java.util.ArrayList;
import java.util.Random;

/**
 * Klasa odpowiedzialna za atrybuty i metody zwiazane z gleba
 */
public class Soil {
    public Double pH;
    public Boolean fertilizerPresence;

    public Soil(Double pH, Boolean fertilizerPresence) {
        this.pH = pH;
        this.fertilizerPresence = fertilizerPresence;
    }

    /**
     * Metoda sprawdzajaca wspolczynnik glebowy z uwzglednieniem nawozu
     */
    public Double fertilizerGrowthRatio() {
        if (fertilizerPresence) {
            return 0.07;
        } else {
            return 0.0;
        }
    }

    /**
     *  Metoda liczaca wspolczynnik glebowy
     */
    public Double growthRatio() {
        if (pH >= 5.5 && pH <= 7.5) {
            return 0.1 + fertilizerGrowthRatio();
        } else {
            return 0.05 + fertilizerGrowthRatio();
        }
    }

    public String toString() {
        ArrayList<String> result = new ArrayList<>();
        result.add("PH gleby: " + this.pH);
        result.add("Czy jest nawóz: " + this.fertilizerPresence);

        return "\n" + String.join("\n", result);
    }

    /**
     * Metoda losujaca wartosci pH dla kazdego kolejnego dnia
     */
    public Soil nextDay() {
        this.pH = new Random().nextDouble() * 10;

        return this;
    }
}


