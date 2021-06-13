package com.applesimulation;

import java.util.Random;

/**
 * Klasa odpowiedzialna za generowanie zycia jablek
 */
public class AppleGenerator {
    public Random numberGenerator;

    public AppleGenerator() {
        this.numberGenerator = new Random();
    }

    /**
     * Metoda generujaca ilosc zycia jablek
     */
    public Apple generate() {
        return new Apple(generateNumber().doubleValue());
    }

    /**
     * Metoda generujaca liczby od 1 do 50
     */
    private Integer generateNumber() {
        return this.numberGenerator.nextInt(50) + 1;
    }
}
