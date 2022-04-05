package Task16;

import java.util.Scanner;

public class sortingNumbersFromLargestToSmaller {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("First number: ");
        int first = scanner.nextInt();
        System.out.print("Second number: ");
        int second = scanner.nextInt();
        System.out.print("Third number: ");
        int third = scanner.nextInt();

        if ((first < second) && (first < third)) {
            if (second < third) {
                System.out.println(first + " < " + second + " < " + third);
            }else {
                System.out.println(first + " < " + third + " < " + second);
            }
        }else if ((second < first) && (second < third)) {
            if (first < third) {
                System.out.println(second + " < " + first + " < " + third);
            }else {
                System.out.println(second + " < " + third + " < " + first);
            }
        }else {
            if (first < second) {
                System.out.println(third + " < " + first + " < " + second);
            }else {
                System.out.println(third + " < " + second + " < " + first);
            }
        }
    }
}
