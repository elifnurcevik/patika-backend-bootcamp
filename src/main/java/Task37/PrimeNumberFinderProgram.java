package Task37;

import java.util.Scanner;

public class PrimeNumberFinderProgram {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.print("Enter a positive number : ");
        int number= scanner.nextInt();

        int prime=isPrime(number,number/2);

        if (prime==1){
            System.out.println(number+" is prime ");
        }else {
            System.out.println(number+" is not prime");
        }
    }

    private static int isPrime(int number, int i) {
        if (i==1){
            return 1;
        }else {
            if (number%i==0){
                return 0;
            }
            else return isPrime(number,i-1);
        }
    }
}
