import java.util.ArrayList;
import java.util.Scanner;

public class GreatestInList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            if (number == -1) {
                break;
            }
            list.add(number);
        }
        System.out.println("");
        int greatest = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            int value = list.get(i);
            if (value > greatest) {
                greatest = value;
            }
        }
        System.out.println("The greatest number: " + greatest);
    }
}