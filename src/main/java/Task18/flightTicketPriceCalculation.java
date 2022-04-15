package Task18;

import java.util.Scanner;

public class flightTicketPriceCalculation {
    public static void main(String[] args) {

        double ageDiscount, kmPrice = 0.10;
        int discountedPrice, roundTripTticketDiscount, totalAmount;


        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the distance in KM");
        int km = scanner.nextInt();

        int normalAmount = (int) (km * kmPrice);

        if (km < 0) {
            System.out.println("You entered wrong!");
            return;
        }
        System.out.println("Enter your age");
        int age = scanner.nextInt();

        if (age < 0) {
            System.out.println("You entered wrong!");
            return;
        }
        System.out.println("Enter trip type \n1) One Way \n2) Round trip");
        int type = scanner.nextInt();

        if (type == 1) {
            if (0 < age && age <= 12) {
                ageDiscount = (normalAmount * 0.50);
                discountedPrice = (int) (normalAmount - ageDiscount);
                System.out.println("Ticket amount :" + discountedPrice + " TL");
            }
            if (age > 12 && age < 24) {
                ageDiscount = (normalAmount * 0.10);
                discountedPrice = (int) (normalAmount - ageDiscount);
                System.out.println("Ticket amount :" + discountedPrice + " TL");
            }
            if (age > 65) {
                ageDiscount = (normalAmount * 0.30);
                discountedPrice = (int) (normalAmount - ageDiscount);
                System.out.println("Ticket amount :" + discountedPrice + " TL");
            }


        } else if (type == 2) {
            if (age <= 12) {
                ageDiscount = (normalAmount * 0.50);
                discountedPrice = (int) (normalAmount - ageDiscount);
                roundTripTticketDiscount = (int) (discountedPrice * 0.20);
                totalAmount = (discountedPrice - roundTripTticketDiscount) * 2;
                System.out.println("Ticket amount :" + totalAmount + " TL");
            }
            if (age > 12 && age < 24) {
                ageDiscount = (normalAmount * 0.10);
                discountedPrice = (int) (normalAmount - ageDiscount);
                roundTripTticketDiscount = (int) (discountedPrice * 0.20);
                totalAmount = (discountedPrice - roundTripTticketDiscount) * 2;
                System.out.println("Ticket amount :" + totalAmount + " TL");
            }
            if (age > 65) {
                ageDiscount = (normalAmount * 0.30);
                discountedPrice = (int) (normalAmount - ageDiscount);
                roundTripTticketDiscount = (int) (discountedPrice * 0.20);
                totalAmount = (discountedPrice - roundTripTticketDiscount) * 2;
                System.out.println("Ticket amount :" + totalAmount + " TL");
            }


        } else {
            System.out.println("You entered wrong!");
        }

    }
}
