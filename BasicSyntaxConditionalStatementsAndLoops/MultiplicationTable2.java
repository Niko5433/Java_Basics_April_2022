package BasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class MultiplicationTable2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int s = Integer.parseInt(scanner.nextLine());

        int result = 0;

        if (s <= 10) {
            for (int i = s; i <= 10; i++) {

                result = n * i;

                System.out.println(n + " X " + i + " = " + result);

            }
        } else {
            result = n * s;
            System.out.printf("%d X %d = %d", n, s, result);
        }
    }
}
