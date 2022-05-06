package Task34;

public class ProgramToFindFibonacciSeriesWithRecursive {
    public static void main(String[] args) {

        for(int i=1;i<10;i++) System.out.print(fibonacci(i)+" - ");
    }

    static int fibonacci(int n)  {
        if(n == 0)
            return 0;
        else if(n == 1)
            return 1;
        else
            return fibonacci(n - 1) + fibonacci(n - 2);    }
}
