
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program, that first reads user input
        // adding them on a list until user gives -1.
        ArrayList<Integer> list = new ArrayList<>();

        int count = 0;
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            if (number == -1) {
                break;
            }
            list.add(number);
            count++;
        }
        // Then it computes the average of the numbers on the list
        // and prints it.
        double sum = 0;
        for (Integer integer : list) {
            sum = (double) integer + sum;
        }
        // System.out.println("Sum: " + sum);
        // System.out.println("Count: " + count);

        System.out.println("Average: " + sum / count);
    }
}
