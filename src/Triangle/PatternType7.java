package Triangle;

import java.util.Scanner;

public class PatternType7 {
    public static void main(String[] args) {

        int n;
        int row;
        int col;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter value of N: ");
        n = scanner.nextInt();

        for (row = 1; row <= n; row++){
            for (col = 1; col <= n; col++){
               // System.out.print(col + " ");
               // System.out.print(row + " ");
               // System.out.print(col % 2+ " ");
               // System.out.print(row % 2+ " ");
               // System.out.print((char) (col + 64) + " ");
                System.out.print((char) (row + 64) + " ");
               // System.out.print(row + " ");
               // System.out.print("* ");
            }
            System.out.println();
        }
    }
}
