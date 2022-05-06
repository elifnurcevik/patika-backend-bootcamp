package Task35;

import java.util.Scanner;

public class AdvancedCalculator {
    static void plus() {
        Scanner scanner = new Scanner(System.in);
        int number, result = 0, i = 1;
        while (true) {
            System.out.print(i++ + "st number :");
            number = scanner.nextInt();
            if (number == 0) {
                break;
            }
            result += number;
        }
        System.out.println("Result : " + result);
    }

    static void minus() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many numbers will you enter? :");
        int counter = scanner.nextInt();
        int number, result = 0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + "st number :");
            number = scanner.nextInt();
            if (i == 1) {
                result += number;
                continue;
            }
            result -= number;
        }

        System.out.println("Result : " + result);
    }

    static void times() {
        Scanner scanner = new Scanner(System.in);
        int number, result = 1, i = 1;

        while (true) {
            System.out.print(i++ + "st number :");
            number = scanner.nextInt();

            if (number == 1)
                break;

            if (number == 0) {
                result = 0;
                break;
            }
            result *= number;
        }

        System.out.println("Result : " + result);
    }

    static void divided() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many numbers will you enter? :");
        int counter = scanner.nextInt();
        double number, result = 0.0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + "th number :");
            number = scanner.nextDouble();
            if (i != 1 && number == 0) {
                System.out.println("You cannot enter the divisor 0.");
                continue;
            }
            if (i == 1) {
                result = number;
                continue;
            }
            result /= number;
        }

        System.out.println("Result : " + result);
    }

    static void power() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the base value :");
        int base = scanner.nextInt();
        System.out.print("Enter exponent :");
        int exponent = scanner.nextInt();
        int result = 1;

        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }

        System.out.println("Result : " + result);
    }

    static void factorial() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number :");
        int n = scan.nextInt();
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        System.out.println("Result : " + result);
    }

    static void rectangularAreaAndPerimeterCalculation() {
        Scanner scanner = new Scanner(System.in);

        int shortEdge = 0;
        int longEdge = 0;

        System.out.println("Enter Short Edge");
        shortEdge=scanner.nextInt();

        System.out.println("Enter Long Edge");
        longEdge=scanner.nextInt();

        int area = shortEdge * longEdge;
        System.out.println("Rectangular Area : " + area);

        int perimeter = 2 * (shortEdge + longEdge);
        System.out.println("Rectangle Perimeter: " + perimeter);
    }

    static void modeRetrieval() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number");
        int number = scanner.nextInt();

        if (number % 2==1)

            System.out.println("Odd number");

        else

            System.out.println("Even number");
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int select;
        String menu = "1- Addition\n"
                + "2- Subtraction\n"
                + "3- Multiplication\n"
                + "4- Division\n"
                + "5- Exponential Calculation\n"
                + "6- Factorial Calculation\n"
                + "7- Mode Retrieval\n"
                + "8- Rectangular Area and Perimeter Calculation\n"
                + "0- Sign out";

        do {
            System.out.println(menu);
            System.out.print("Please select an action :");
            select = scan.nextInt();
            switch (select) {
                case 1:
                    plus();
                    break;
                case 2:
                    minus();
                    break;
                case 3:
                    times();
                    break;
                case 4:
                    divided();
                    break;
                case 5:
                    power();
                    break;
                case 6:
                    factorial();
                    break;
                case 7:
                    modeRetrieval();
                    break;
                case 8:
                    rectangularAreaAndPerimeterCalculation();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("You entered an incorrect value, try again.");
            }
        } while (select != 0);


    }


}
