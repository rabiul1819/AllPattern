package Triangle;

import java.util.Scanner;

public class PatternType3 {
    public static void main(String[] args) {

        int n;
        int col;
        int row;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of N: ");

       n = input.nextInt();

       for (row = 1; row <= n; row++){
           for (col = 1; col <= row ; col++){
               System.out.print(col  + " ");
              // System.out.print(row  + " ");
              // System.out.print(col % 2 + " ");
              // System.out.print(row % 2 + " ");
              // System.out.print(row  + " ");
              // System.out.print((char) (row  + 64) + " ");
               //System.out.print((char) (col  + 64) + " ");
              // System.out.print("* ");
           }
           System.out.println(" ");
       }

       for (row = n - 1; row >= 1; row--){
           for (col = 1; col <= row; col++){
                System.out.print(col + " ");
              // System.out.print(row + " ");
             //  System.out.print(col % 2 + " ");
              // System.out.print(row % 2 + " ");
              // System.out.print((char) (row  + 64) + " ");
              // System.out.print((char) (col  + 64) + " ");
              // System.out.print("* ");
           }
           System.out.println(" ");
       }
    }
}
