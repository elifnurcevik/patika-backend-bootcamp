package Task10;

import java.util.Scanner;

public class findPowersOfFourAndFive {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = scanner.nextInt();
        System.out.println();

        System.out.println("The power of four");
        for (int i = 1; i <= number; i*=4) {
            System.out.println(i);
        }
        System.out.println();

        System.out.println("The power of five");
        for (int i = 1; i <= number; i*=5) {
            System.out.println(i);
        }
    }
}
