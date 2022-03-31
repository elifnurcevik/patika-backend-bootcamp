package Task01;

import java.util.Scanner;

public class gradeAverage {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Math grade: ");
        int math = scanner.nextInt();

        System.out.print("Physics grade: ");
        int physics = scanner.nextInt();

        System.out.print("Chemistry grade: ");
        int chemistry = scanner.nextInt();

        System.out.print("Turkish grade: ");
        int turkish = scanner.nextInt();

        System.out.print("History grade: ");
        int history = scanner.nextInt();

        System.out.print("Music grade: ");
        int music = scanner.nextInt();

        int sum = (math + physics + chemistry + turkish + history + music);
        double average = sum / 6;
        System.out.print("Your grade point average: " + average);
        System.out.println();

        String result = average >= 60 ? "You passed the class" : "You failed the class";
        System.out.println(result);
    }
}
