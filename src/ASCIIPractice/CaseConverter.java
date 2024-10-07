package ASCIIPractice;

import java.util.Scanner;

public class CaseConverter {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = input.next().charAt(0);  // Read input as a String

        // Check if the character is uppercase or lowercase and convert accordingly
        if (Character.isUpperCase(ch)){

            // Convert to lowercase
            char lower = Character.toLowerCase(ch);
            System.out.println("Converted to lowercase: " + lower);

        }
        else if (Character.isLowerCase(ch)){
            // Convert to uppercase
            char upper = Character.toUpperCase(ch);
            System.out.println("Converted to uppercase: " + upper);

        }
        else {
            System.out.println("Please enter a valid alphabetic character.");
        }

        input.close();



    }
}
