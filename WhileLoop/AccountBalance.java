package WhileLoop;

import java.util.Scanner;

public class AccountBalance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        double balance = 0;

        while (!input.equals("NoMoreMoney")) {
            double currentBalance = Double.parseDouble(input);

            if (currentBalance <= 0) {
                System.out.printf("Invalid operation!%n");
                break;
            }
            System.out.printf("Increase: %.2f%n", currentBalance);

            balance += currentBalance;

            input = scanner.nextLine();
        }
        System.out.printf("Total: %.2f", balance);

    }
}
