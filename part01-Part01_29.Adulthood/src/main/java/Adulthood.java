
import java.util.Scanner;

public class Adulthood {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here
        // input
        System.out.println("How old are you?");
        int age = Integer.valueOf(scan.nextLine());

        // condition
        if (age >= 18) {
            // print
            System.out.println("You are an adult");
        } else {
            // print
            System.out.println("You are not an adult");
        }
    }
}
