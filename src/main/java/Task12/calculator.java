package Task12;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int first = scanner.nextInt();
        System.out.println("Enter second number: ");
        int second = scanner.nextInt();

        System.out.println("\n1) Addition \n2) Extraction process \n3) Multiplication \n4) Division \n");
        System.out.print("Your choice: ");
        int choice = scanner.nextInt();

        int division = first / second;
        int remainder = first % second;

        switch (choice) {
           case 1:
              System.out.println(first + " + " + second + " = " + (first + second));
              break;

           case 2:
               System.out.println(first + " - " + second + " = " + (first - second));
               break;

           case 3:
               System.out.println(first + " * " + second + " = " + (first * second));
               break;

           case 4:
               if (second != 0) {
                   System.out.println(first + " / " + second + " = " + (first / second));
                   System.out.println("Division = " + division);
               }else {
                   System.out.println("A number cannot be divided by zero");
               }
               break;

            default:
                System.out.println("You made the wrong choice. Try again");

        }
    }
}
