package Task07;

import java.util.Scanner;

public class shoppingAmount {
    public static void main(String[] args) {

        double pear = 2.17;
        double apple = 3.67;
        double tomato = 1.11;
        double banana = 0.95;
        double eggplant = 5.00;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Weight of pear: ");
        double pearWeight = scanner.nextDouble();
        System.out.print("Weight of apple: ");
        double appleWeight = scanner.nextDouble();
        System.out.print("Weight of tomato: ");
        double tomatoWeight = scanner.nextDouble();
        System.out.print("Weight of banana: ");
        double bananaWeight = scanner.nextDouble();
        System.out.print("Weight of eggplant: ");
        double eggplantWeight = scanner.nextDouble();
        double totalAmount =((pear*pearWeight) + (apple*appleWeight) + (tomato*tomatoWeight) + (banana*bananaWeight) + (eggplant*eggplantWeight));
        System.out.print("Total amount: " + totalAmount);
    }
}
