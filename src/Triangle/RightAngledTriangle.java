package Triangle;

import java.util.Scanner;

// Right-Angled Triangle Pattern or a Pyramid Pattern (with left alignment

public class RightAngledTriangle {
    public static void main(String[] args) {

        int n;
        int row;
        int col;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter value of N: ");
        n = input.nextInt();

        for ( row = 1; row <= n; row++){
            for ( col = 1; col <= row; col++){
                //System.out.print(col + " ");
                //System.out.print("* ");
                //System.out.print(row + " ");
               // System.out.print(col % 2 + " ");
                //System.out.print(row % 2 + " ");
                //System.out.print((char) (col + 64 )+ " ");
                //System.out.print((char) (row + 64 )+ " ");
                System.out.print(col * row + " ");

            }
            System.out.println();

        }
        input.close();

    }
}