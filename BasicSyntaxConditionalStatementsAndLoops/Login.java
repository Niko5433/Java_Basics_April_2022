package BasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String username = scanner.nextLine();

        String password = "";

        for (int possition = username.length() - 1; possition >= 0; possition--) {
            char currentSymbol = username.charAt(possition);
            password += currentSymbol;
        }
        int passFailed = 0;
        String enteredPassword = scanner.nextLine();

        while (!enteredPassword.equals(password)) {
            passFailed++;
            if (passFailed >= 4) {
                System.out.printf("User %s blocked!", username);
                break;
            }
            System.out.println("Incorrect password. Try again.");
            enteredPassword = scanner.nextLine();
        }
        if (enteredPassword.equals(password)) {
            System.out.printf("User %s logged in.", username);
        }
    }
}
