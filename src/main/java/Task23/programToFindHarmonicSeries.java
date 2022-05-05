package Task23;

import java.util.Scanner;

public class programToFindHarmonicSeries {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number N -> ");
        double n = scanner.nextInt();

        double result = 0;

        while (n > 0) {
            result += (1 / n);
            n--;
        }

        System.out.println("Result -> " + result);
    }
}
