package Task02;

import java.util.Scanner;

public class vatAmount {

    public static void main(String[] args) {

        double vatRate = 0.18;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the fee amount: ");
        double amount = scanner.nextDouble();

        double vatAmount = amount * vatRate;
        double amountWithVat = amount + vatAmount;

        System.out.println("Amount: " + amount);
        System.out.println("VAT Rate: " + vatRate);
        System.out.println("VAT Amount: " + vatAmount);
        System.out.println("Amount with VAT: " + amountWithVat);
    }
}
