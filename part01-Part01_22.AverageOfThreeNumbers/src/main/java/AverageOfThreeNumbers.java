
import java.util.Scanner;

public class AverageOfThreeNumbers {

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

        // print
        System.out.println("The average is " + (firstNumber + secondNumber + thirdNumber) / 3.0);

    }
}
