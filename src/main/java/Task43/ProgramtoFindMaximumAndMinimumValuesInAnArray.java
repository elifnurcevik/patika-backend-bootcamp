package Task43;

import java.util.Arrays;
import java.util.Scanner;

public class ProgramtoFindMaximumAndMinimumValuesInAnArray {

    public static void main(String[] args) {

        int[] list = {15,12,788,1,-1,-778,2,0};

        Scanner scanner= new Scanner(System.in);

        System.out.println(Arrays.toString(list));


        Arrays.sort(list);

        System.out.println("\nArray order from least = " + Arrays.toString(list));

        System.out.print("\nEnter the number from array = ");
        int number = scanner.nextInt();

        for(int i : list){
            if(i>number){
                System.out.println("\nThe big and the closest number: " + i);
                System.out.println("The small and the closest number: " + list[Arrays.binarySearch(list,i) - 1]);
                break;
            }
        }
    }
}
