
import java.util.Scanner;

public class SpeedingTicket {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here.

        // input
        System.out.println("Give speed:");
        int speed = Integer.valueOf(scanner.nextLine());

        // condition
        if (speed > 120) {
            System.out.println("Speeding ticket!");
        }
    }
}
