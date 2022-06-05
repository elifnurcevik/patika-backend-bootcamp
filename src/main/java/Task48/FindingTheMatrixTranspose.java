package Task48;

import java.util.Scanner;

public class FindingTheMatrixTranspose {

    public static void main(String[] args) {

        int row =2, column = 3;

        Scanner scanner = new Scanner(System.in);

        int[][] matrix = new int[row][column];

        for(int i=0; i<row; i++)
        {
            for(int j=0; j<column; j++)
            {
                System.out.printf("%d. row %d. enter column element:", i+1, j+1);
                matrix[i][j]= scanner.nextInt();
            }
        }

        System.out.println("\nEntered 2 dimensional array: ");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<column;j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("\nTransposed 2 dimensional array:");
        for(int i=0;i<column;i++)
        {
            for(int j=0;j<row;j++)
            {
                System.out.print(matrix[j][i]+" ");
            }
            System.out.println();
        }
    }
}
