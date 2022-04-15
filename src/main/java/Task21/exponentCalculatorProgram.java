package Task21;

import java.util.Scanner;

public class exponentCalculatorProgram {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a first number");
        int first = scanner.nextInt();

        System.out.println("Enter a second number");
        int second = scanner.nextInt();

        long result = 1;

        for (;second != 0; --second)
        {
            result *= first;
        }

        System.out.println("Result = " + result);
    }
}
