package com.applesimulation;

public class Main {

    public static void main(String[] args) {
        Apple firstApple= new Apple("Gala", "red", 5, 95, "small", 90, 100);
        Apple secondApple= new Apple("Ligol", "bright red", 50, 50, "big", 95, 100);
        Apple thirdApple= new Apple("Lobo", "green-yellow", 56, 44, "medium", 15, 100);
        Apple fourthApple= new Apple("Gloster", "carmine", 40, 60, "big", 50, 100);
        Apple fifthApple= new Apple("Szampion", "yellow-red", 5, 95, "big", 85, 100);
        Apple sixthApple= new Apple("Antonówka", "light yellow", 25, 75, "medium", 83, 100);
        Apple seventhApple= new Apple("Szara Reneta", "gray-olive", 50, 50, "big", 90, 100);
        Apple eighthApple= new Apple("Gortland", "green", 36, 64, "medium", 75, 100);
        Apple ninthApple= new Apple("Kosztela", "red", 95, 5, "medium", 100, 100);
        Apple tenthApple= new Apple("Malinowa Oberlandzka", "light purple", 5, 95, "big", 85, 100);
        Apple eleventhApple= new Apple("Rubin", "orange", 10, 90, "big", 50, 100);
        Apple twelfthApple= new Apple("Delikates", "green-yellow", 50, 50, "big", 50, 100);
        Apple thirteenthApple= new Apple("Paulared", "red-green", 50, 50, "small", 75, 100);
        Apple fourteenthApple= new Apple("Papierówka", "light yellow", 65, 35, "medium", 50, 100);
        Apple fifteenthApple= new Apple("Jonagold", "green-yellow", 20, 80, "big", 60, 100);
        Apple sixteenthApple= new Apple("Golden Delicious", "green-yellow", 14, 86, "medium", 70, 100);
        Apple seventeenthApple= new Apple("Wilton's Star", "creamy yellow", 13, 87, "medium", 93, 100);

        Weather veryFrosty= new Weather(17.8, 100, "Yes", 66, 45, 40, 68.9, 55, 0, 100);
//        Weather frosty= new Weather();
//        Weather moderatelyFrosty= new Weather();
//        Weather moderatelyWarm= new Weather();

        AppleTree firstAppleTree= new AppleTree(0, 100);

//        System.out.println(redApple.colour + " " + redApple.acidity + " " + redApple.sweetness);
//        System.out.println(greenApple.colour + " " + greenApple.acidity + " " + greenApple.sweetness);
        System.out.println("Types of apple \n");
        System.out.println(firstApple);
        System.out.println(secondApple);
        System.out.println(thirdApple);
        System.out.println(fourthApple);
        System.out.println(fifthApple);
        System.out.println(sixthApple);
        System.out.println(seventhApple);
        System.out.println(eighthApple);
        System.out.println(ninthApple);
        System.out.println(tenthApple);
        System.out.println(eleventhApple);
        System.out.println(twelfthApple);
        System.out.println(thirteenthApple);
        System.out.println(fourteenthApple);
        System.out.println(fifteenthApple);
        System.out.println(sixteenthApple);
        System.out.println(seventeenthApple);

        System.out.println("Types of weather \n");
        System.out.println(veryFrosty);

        System.out.println(firstAppleTree);
    }
}
