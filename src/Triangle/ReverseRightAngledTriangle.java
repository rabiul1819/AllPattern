package Triangle;

// Inverted Half Pyramid or Reverse Half Pyramid.

import java.util.Scanner;

public class ReverseRightAngledTriangle {
    public static void main(String[] args) {

        int n;
        int row;
        int col;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter value of N: ");
        n = input.nextInt();

        for ( row= n; row >= 1; row--){
            for ( col = 1; col <= row; col++){

               // System.out.print(col + " ");
               // System.out.print(row + " ");
               // System.out.print(col % 2 + " ");
                //System.out.print(row % 2 + " ");
               // System.out.print((char) (col + 64) + " ");
                System.out.print((char) (row + 64) + " ");

            }
            System.out.println(" ");

        }
        input.close();
    }
}
