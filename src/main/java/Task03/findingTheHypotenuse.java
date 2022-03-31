package Task03;

import java.util.Scanner;

public class findingTheHypotenuse {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first side: ");
        int firstSide = scanner.nextInt();

        System.out.print("Enter the second side: ");
        int secondSide = scanner.nextInt();

        double hypotenuse = Math.sqrt((firstSide * firstSide) + (secondSide * secondSide));
        System.out.print("Hypotenuse: " + hypotenuse);
    }
}
