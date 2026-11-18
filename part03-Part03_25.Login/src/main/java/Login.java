
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // todo username and passwords
        String userName1 = "alex";
        String userName2 = "emma";
        String userPassword1 = "sunshine";
        String userPassword2 = "haskell";

        // todo user input
        System.out.println("Enter username: ");
        String askUserName = scanner.nextLine();
        System.out.println("Enter username: ");
        String askUserPassword = scanner.nextLine();

        // todo comapare
        if (askUserName.equals(userName1) && askUserPassword.equals(userPassword1)
                || askUserName.equals(userName2) && askUserPassword.equals(userPassword2)) {
            System.out.println("You have successfully logged in!");
        } else {
            System.out.println("Incorrect username or password!");
        }
    }
}
