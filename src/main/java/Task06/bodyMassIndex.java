package Task06;

import java.util.Scanner;

public class bodyMassIndex {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your height (meter type): ");
        double height = scanner.nextDouble();
        System.out.print("Enter your weight (kg type): ");
        double weight = scanner.nextDouble();
        double bMI = weight / (height * height);
        System.out.print("Your body mass index: " + bMI);
    }
}
