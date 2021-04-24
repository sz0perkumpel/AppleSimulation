package com.applesimulation;

public class Main {

    public static void main(String[] args) {
        Apple redApple= new Apple("red", 15, 85);
        Apple greenApple= new Apple("green", 90, 10);
//        System.out.println(redApple.colour + " " + redApple.acidity + " " + redApple.sweetness);
//        System.out.println(greenApple.colour + " " + greenApple.acidity + " " + greenApple.sweetness);
        System.out.println(redApple);
        System.out.println(greenApple);
    }
}
