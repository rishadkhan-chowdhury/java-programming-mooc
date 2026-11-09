
import java.util.Scanner;

public class SumOfTwoNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here

        // first number
        System.out.println("Give the first number:");
        int firstNumber = Integer.valueOf(scanner.nextLine());
        // second number
        System.out.println("Give the second number:");
        int secondNumber = Integer.valueOf(scanner.nextLine());

        // calculation
        int calculation = firstNumber + secondNumber;

        System.out.println("The sum of the numbers is " + calculation);
    }
}
