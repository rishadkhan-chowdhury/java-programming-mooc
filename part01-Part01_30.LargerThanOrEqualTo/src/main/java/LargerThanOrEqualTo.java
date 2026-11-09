
import java.util.Scanner;

public class LargerThanOrEqualTo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // input
        System.out.println("Give the first number:");
        int firstNumber = Integer.valueOf(scan.nextLine());
        System.out.println("Give the second number:");
        int secondNumber = Integer.valueOf(scan.nextLine());

        // conditions
        if (firstNumber > secondNumber) {
            // print
            System.out.println("Greater number is: " + firstNumber);
        } else if (secondNumber > firstNumber) {
            // print
            System.out.println("Greater number is: " + secondNumber);
        } else {
            // print
            System.out.println("The numbers are equal!");
        }
    }
}
