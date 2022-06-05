package Task46;

import java.util.Arrays;
import java.util.Scanner;

public class SortingElementsInAnArray {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int arrayLength;
        do {
            System.out.print("Enter array length: ");
            arrayLength = scanner.nextInt();
            System.out.println();
        }
        while (arrayLength <= 0);

        int[] array = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            System.out.print("Enter array [" + i + "]: ");
            array[i] = scanner.nextInt();
        }

        System.out.println("\nTotal number of items: " + array.length);

        Arrays.sort(array);

        System.out.print("\nSorting Elements in an Array = ");
        System.out.print(Arrays.toString(array));
    }
}
