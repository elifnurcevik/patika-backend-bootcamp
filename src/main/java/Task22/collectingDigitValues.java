package Task22;

import java.util.Scanner;

public class collectingDigitValues {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number, value, total = 0;

        System.out.println("Program for collecting digit values");

        System.out.println("Please enter the number: ");
        number = scanner.nextInt();

        int lengths = String.valueOf(number).length();

        for (int i = 1; i <= lengths; i++) {
            value = number % 10;
            total = total + value;
            number = number / 10;
        }
        System.out.println("Total: " + total);
    }
}
