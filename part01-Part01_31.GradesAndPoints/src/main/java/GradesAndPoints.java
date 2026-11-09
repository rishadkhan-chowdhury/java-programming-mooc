
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // input
        System.out.println("Give points [0-100]:");
        int point = Integer.valueOf(scan.nextLine());

        // conditons
        if (point < 0) {
            // print
            System.out.println("Impossible");
        } else if (point <= 49) {
            // print
            System.out.println("failed");
        } else if (point >= 50 && point <= 59) {
            // print
            System.out.println("1");
        } else if (point >= 60 && point <= 69) {
            // print
            System.out.println("2");
        } else if (point >= 70 && point <= 79) {
            // print
            System.out.println("3");
        } else if (point >= 80 && point <= 89) {
            // print
            System.out.println("4");
        } else if (point >= 90 && point <= 100) {
            // print
            System.out.println("5");
        } else {
            // print
            System.out.println("Incredible!");
        }

    }
}
