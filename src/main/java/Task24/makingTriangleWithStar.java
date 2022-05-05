package Task24;

import java.util.Scanner;

public class makingTriangleWithStar {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.print("Enter the number -> ");
        int number = scanner.nextInt();

        System.out.println();

        int height = (number / 2) + 1;

        for(int i = 1; i <= height; i++)
        {
            for(int j = 1; j <= height-i; j++)
                System.out.print(" ");

            for(int j = 1; j <= 2 * i - 1; j++)
                System.out.print("*");

            System.out.println();
        }

        for(int i = height-1; i >= 1; i--)
        {
            for(int j = 1; j <= height-i; j++)
                System.out.print(" ");

            for(int j = 1; j <= 2 * i - 1; j++)
                System.out.print("*");

            System.out.println();
        }
    }
}

