package ConditionalStatements;

import java.util.Scanner;

public class ExcellentResult {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int Note =Integer.parseInt(scanner.nextLine());

        if (Note >= 5) {
            System.out.println("Excellent!");
        }


    }
}
