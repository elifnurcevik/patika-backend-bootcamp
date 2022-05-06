package Task31;

import java.util.Scanner;

public class ProgramToFindFibonacciSeries {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int firstNumber = 1;
        int secondNumber = 1;
        int nextNumber, number;

        System.out.print("Enter Fibonacci Numbers -> ");
        number = scanner.nextInt();

        System.out.println();

        System.out.print(firstNumber + " ");
        System.out.print(secondNumber + " ");

        for (int i = 0; i < number - 2; i++) {
            nextNumber = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = nextNumber;

            System.out.print(nextNumber + " ");

        }

        System.out.println();
    }
}
