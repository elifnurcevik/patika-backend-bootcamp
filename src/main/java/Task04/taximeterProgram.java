package Task04;

import java.util.Scanner;

public class taximeterProgram {
    public static void main(String[] args) {

        double perKM = 2.20;
        double startPrice = 10;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the distance (KM) : ");
        int km = scanner.nextInt();

        double total = (km * perKM);
        total += startPrice;

        total = (total < 20) ? 20 : total;
        System.out.println("Total amount: " + total);
    }
}
