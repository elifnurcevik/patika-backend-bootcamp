package Task14;

import java.util.Scanner;

public class statusOfPassingTheClass {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Your math note: ");
        int math = scanner.nextInt();

        System.out.print("Your Turkish note: ");
        int turkish = scanner.nextInt();

        System.out.print("Your chemistry note: ");
        int chemistry = scanner.nextInt();

        System.out.print("Your physics note: ");
        int physics = scanner.nextInt();

        System.out.print("Your musical note: ");
        int music = scanner.nextInt();

        double average = (math + turkish + chemistry + physics + music) / 5;

        if (0 < average && average < 55) {
            System.out.println("You did not pass the class \nYour average: " + average);
        } else {
            System.out.println("Congratulations! You successfully passed the class... \nYour average: " + average);
        }

    }
}
