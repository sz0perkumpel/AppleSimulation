package com.applesimulation;

import java.util.Random;

/**
 * Klasa odpowiedzialna za generowanie zycia jabloni i ilosci jablek
 */
public class AppleTreeGenerator {
    public Random numberGenerator;

    public AppleTreeGenerator() {
        this.numberGenerator = new Random();
    }

    /**
     * Metoda generujaca liczbe jablek i ilosc zycia jabloni
     */
    public AppleTree generate() {
        AppleTree appleTree = new AppleTree(generateNumber().doubleValue());
        AppleGenerator appleGenerator = new AppleGenerator();
        int numberOfApples = generateNumber();
        for (int i = 0; i < numberOfApples; i++) {
            appleTree.addApple(appleGenerator.generate());
        }
        return appleTree;
    }

    /**
     * Metoda generujaca liczby od 1 do 100
     */
    private Integer generateNumber() {
        return this.numberGenerator.nextInt(100) + 1;
    }
}
