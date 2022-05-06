package Task30;

public class ProgramToFindPrimeNumbersBetweenOneAndHundred {
    public static void main(String[] args) {

        System.out.println("Prime Numbers 1-100 \n");

        for (int number = 2; number <= 100; number++) {
            int flag = 0;
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    flag = 1;
                    break;
                }
            }

            if (flag == 0) {
                System.out.print(number + ", ");
            }
        }
        System.out.println();
    }

}
