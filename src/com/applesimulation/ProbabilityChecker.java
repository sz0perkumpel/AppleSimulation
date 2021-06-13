package com.applesimulation;

import java.util.Random;

/**
 * Klasa odpowiedzialna za sprawdzenie sukcesu prawdopobienstwa zlych warunkow dla danych klimatow
 */
public class ProbabilityChecker {
    public Random numberGenerator;
    public Double probability;

    public ProbabilityChecker(Double probability) {
        this.probability = probability;
        this.numberGenerator = new Random();
    }

    /**
     * Metoda sprawdzajaca warunek dla prawdopodobienstwa zlych warunkow pogodowych
     */
    public Boolean success() {
        return numberGenerator.nextDouble() < probability;
    }
}
