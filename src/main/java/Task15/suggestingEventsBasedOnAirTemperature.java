package Task15;

import java.util.Scanner;

public class suggestingEventsBasedOnAirTemperature {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("How many degrees is the weather today?");
        int degree = scanner.nextInt();

        if (degree<5) {
            System.out.println("("+ degree +" C) " + "Today is a great day for skiing");
        }else if (5<=degree && degree<15) {
            System.out.println("("+ degree +" C) " + "Great day to go to the movies");
        }else if (10<=degree && degree<25) {
            System.out.println("("+ degree +" C) " + "What a perfect day for a picnic");
        }else {
            System.out.println("("+ degree +" C) " + "It's warm enough to swim today");
        }
    }
}
