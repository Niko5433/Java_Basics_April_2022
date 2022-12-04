package BasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int startNumber = number;

        int sumFact = 0;

        while (number > 0) {
            int lastDigid = number % 10;

            int fact = 1;
            for (int i = 1; i <= lastDigid; i++) {
                fact = fact * i;

            }
            sumFact += fact;

            number = number / 10;
        }
        if (sumFact == startNumber) {
            System.out.printf("yes");
        } else {
            System.out.printf("no");
        }
    }
}
