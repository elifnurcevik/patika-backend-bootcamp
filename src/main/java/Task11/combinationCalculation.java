package Task11;

import java.util.Scanner;

public class combinationCalculation {
    public static void main(String[] args) {


        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter first number: ");
        int first = scanner.nextInt();

        System.out.print("Enter second number: ");
        int second = scanner.nextInt();

        if( first < second) {

            System.out.print("The first number must be greater than the second number. Please enter the first number again: ");
            first = scanner.nextInt();
            calculateCombination(first,second);
        } else {
            calculateCombination(first,second);
        }
    }

    private static void calculateCombination(int first, int second) {

        int faktorial1 = 1;
        int faktorial2 = 1;
        int faktorial3 = 1;
        int difference = first - second;

        for(int i=1; i <= first; i++){

            faktorial1 = faktorial1 * i;
        }
        System.out.println(first + "! = " + faktorial1);

        for(int j=1; j <= second; j++) {

            faktorial2 = faktorial2 * j;
        }
        System.out.println(second + "! = " + faktorial2);

        for(int k=1; k <= difference; k++) {

            faktorial3 = faktorial3 * k;
        }
        System.out.println("(" + first + "-" + second + ")" + "! = " + faktorial3);

        int multiplication = faktorial2 * faktorial3;
        int combination = faktorial1 / multiplication;
        System.out.println("C"+"(" + first + "," + second + ")" + " = " + combination);
        System.out.println();
        System.out.println("* * * * * * * * * * * * * * * * * * * *");
        System.out.println("*               Formula               *\n*    C(n,r) = n! / ( r! * (n-r)! )    *");
        System.out.println("* * * * * * * * * * * * * * * * * * * *");

    }

}
