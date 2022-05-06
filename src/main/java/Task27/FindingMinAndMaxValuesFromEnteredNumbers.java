package Task27;

import java.util.Scanner;

public class FindingMinAndMaxValuesFromEnteredNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int max = 0, min = 0;

        int [] array = new int[4];

        for(int i = 0; i < 4; i++)
        {
            System.out.print("Enter the " + (i+1) + ". element of the array: ");
            array[i] = scanner.nextInt();
            if(i == 0) {
                max = array[i];
                min = array[i];
            }
            if(array[i] > max) {
                max = array[i];
            }
            if(array[i] < min) {
                min = array[i];
            }
        }

        System.out.println("Biggest number: " + max);
        System.out.println("Smallest number: " + min);
    }
}
