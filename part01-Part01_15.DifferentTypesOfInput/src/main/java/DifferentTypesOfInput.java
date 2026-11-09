
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here

        // string
        System.out.println("Give a string:");
        String name = scan.nextLine();

        // integer
        System.out.println("Give an integer:");
        int value = Integer.valueOf(scan.nextLine());

        // double
        System.out.println("Give a double:");
        double doubleValue = Double.valueOf(scan.nextLine());

        // boolean
        System.out.println("Give a boolean:");
        boolean value1 = Boolean.valueOf(scan.nextLine());

        System.out.println("You gave the string " + name);
        System.out.println("You gave the integer " + value);
        System.out.println("You gave the double " + doubleValue);
        System.out.println("You gave the boolean " + value1);


    }
}
