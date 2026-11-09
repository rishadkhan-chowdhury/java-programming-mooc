
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        // input
        int num1 = Integer.valueOf(scanner.nextLine());
        int num2 = Integer.valueOf(scanner.nextLine());

        int total = num1 + num2;
        double root = Math.sqrt(total);

        // output
        System.out.println(root);
    }
}
