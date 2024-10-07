package ASCIIPractice;

public class PrintingUppercase {
    public static void main(String[] args) {

        System.out.println("Uppercase Letters are:");
        System.out.println("----------------------");

        for (int i = 65 ; i <= 90 ; i++){
            System.out.print((char) i + " ");
        }
    }
}
