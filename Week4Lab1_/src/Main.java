import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        while (true) {
            System.out.println("Please enter an integer: ");
            try {
                n = input.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Error detected: You entered text instead of numbers!");
                input.nextLine();
            }

        }
        System.out.println("number received: " + n);
        // input.close();
    }
}