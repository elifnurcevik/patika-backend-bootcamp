package Task05;

import java.util.Scanner;

public class areaAndCircumferenceOfTheCircle {
    public static void main(String[] args) {

        double pi = 3.14;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        int radius = scanner.nextInt();
        double area = (pi * radius * radius);
        double circumference = (2 * pi * radius);

        System.out.print("Area of the circle: " + area);
        System.out.print("Circumference of the circle: " + circumference);
    }
}
