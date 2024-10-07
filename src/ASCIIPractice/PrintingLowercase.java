package ASCIIPractice;

public class PrintingLowercase {
    public static void main(String[] args) {

        System.out.println("Lowercase Letters are:");
        System.out.println("----------------------");

        for (int i = 97 ; i <= 122 ; i++){
            System.out.print((char) i + " ");
        }
    }
}
