package ConditionalStatements;

import javax.xml.transform.SourceLocator;
import java.util.Scanner;

public class PasswordGuess {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String Name = scanner.nextLine();

        if (Name .equals("s3cr3t!P@ssw0rd")){
            System.out.println("Welcome");
        }
        else {
            System.out.println("Wrong password!");
        }

    }
}
