package com.applesimulation;

import java.util.Random;

public class AppleTreeGenerator {
    public Random numberGenerator;

    public AppleTreeGenerator() {
        this.numberGenerator = new Random();
    }
    public AppleTree generate(){
        return new AppleTree(generateNumber(), generateNumber());
    }
    private Integer generateNumber() {
       return this.numberGenerator.nextInt(101);
    }
}
