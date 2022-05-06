package Task33;

import java.util.Scanner;

public class PalindromeNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = scanner.nextInt();

        String str = String.valueOf(number);
        int i = 0;
        int j = str.length() - 1;
        boolean control = true;

        while (i < j) {
            if (str.charAt(i++) != str.charAt(j--)) {
                control = false;
                break;
            }
        }

        if (control)
            System.out.println(number+" is a palindrome number");
        else
            System.out.println(number+" is not a palindrome number");
    }
}
