package Triangle;

import java.util.Scanner;

public class SpacePattern1 {
    public static void main(String[] args) {

        int n;
        int row;
        int col;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter value of N: ");
        n = scanner.nextInt();

        for (row = 1; row <= n; row++){
            //print space
            for (col = 1; col <= n - row; col++){
                System.out.print("  ");
            }
           // print number
            for (col = 1; col <= row; col++){
                System.out.print(col + " ");
            }
            System.out.println("");
        }

    }
}
