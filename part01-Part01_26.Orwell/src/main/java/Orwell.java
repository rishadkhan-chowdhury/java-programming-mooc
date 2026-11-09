
import java.util.Scanner;

public class Orwell {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here
        // input
        System.out.println("Give a number:");
        int number = Integer.valueOf(scan.nextLine());

        // condition
        if (number == 1984) {
            System.out.println("Orwell");
        }
    }
}
