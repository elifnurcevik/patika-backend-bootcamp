package Task26;

import java.util.Scanner;

public class find_GCD_LCW {

    public static void main(String[] args) {

        while (true) {

            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the first number: ");
            int firstNumber = scanner.nextInt();
            System.out.print("Enter the second number: ");
            int secondNumber = scanner.nextInt();

            int GCD = GCD(firstNumber, secondNumber);

            int LCW = LCW(firstNumber, secondNumber, GCD);

            System.out.println("The numbers you entered -> "
                    + firstNumber + ", " + secondNumber
                    + "\nGreatest Common Divider (GCD):  "+GCD
                    + "\nLeast Common Multiple (LCW): "+LCW);

        }

    }

    private static int LCW(int firstNumber, int secondNumber, int GCD) {
        int LCW = (firstNumber*secondNumber)/GCD;
        return LCW;
    }

    private static int GCD(int firstNumber, int secondNumber) {
        int GCD =1;

        for(int i = 2;i<=firstNumber&&i<=secondNumber;i++){
            if(firstNumber%i==0 && secondNumber%i==0){
                GCD=i;
            }
        }
        return GCD;
    }


}

