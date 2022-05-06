package Task36;

import java.util.Scanner;

public class ExponentCalculatorProgram {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the base number whose power you want to calculate");
        int base = scanner.nextInt();

        System.out.println("Enter the force you want to calculate");
        int power = scanner.nextInt();

        int result = (int) Math.pow(base, power);

        System.out.println("Result -> " + result);
    }
}
