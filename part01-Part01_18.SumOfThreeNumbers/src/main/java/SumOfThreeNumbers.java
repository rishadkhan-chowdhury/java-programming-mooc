
import java.util.Scanner;

public class SumOfThreeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        // first number
        System.out.println("Give the first number:");
        int firstNumber = Integer.valueOf(scanner.nextLine());
        // second number
        System.out.println("Give the second number:");
        int secondNumber = Integer.valueOf(scanner.nextLine());
        // third number
        System.out.println("Give the third number:");
        int thirdNumber = Integer.valueOf(scanner.nextLine());

        // calculation
        int calculation = firstNumber + secondNumber + thirdNumber;

        System.out.println("The sum of the numbers is " + calculation);

    }
}
