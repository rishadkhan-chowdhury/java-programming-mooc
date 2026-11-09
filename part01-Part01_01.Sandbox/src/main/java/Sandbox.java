import java.util.Scanner;

public class Sandbox {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Write your program here
        System.out.println("Enter the first number:");
        int first = Integer.valueOf(scanner.nextLine());
        System.out.println("Enter second number:");
        int second = Integer.valueOf(scanner.nextLine());

        System.out.println("The sum is: " + sum(first, second));
    }

    // own method
    public static int sum(int one, int two) {
        return one + two;
    }
}
