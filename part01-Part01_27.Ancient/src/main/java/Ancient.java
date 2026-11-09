
import java.util.Scanner;

public class Ancient {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here
        // input
        System.out.println("Give a year:");
        int year = Integer.valueOf(scan.nextLine());

        // condition
        if (year < 2015) {
            // output
            System.out.println("Ancient history!");
        }
    }
}
