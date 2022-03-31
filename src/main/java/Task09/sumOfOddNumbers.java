package Task09;

import java.util.Scanner;

public class sumOfOddNumbers {
    public static void main(String[] args) {
        int numbers;
        int total = 0;

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Enter number: ");
            numbers = scanner.nextInt();
            if (numbers % 2 == 1) {
                total += numbers;
            }
        } while (numbers > 0);
        System.out.println("Total: " + total);
    }
}
