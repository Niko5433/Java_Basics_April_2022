package BasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class PrintAndSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numA = Integer.parseInt(scanner.nextLine());
        int numb = Integer.parseInt(scanner.nextLine());

        int sum = 0;

        for (int i = numA; i <= numb ; i++) {

            sum += i;
            System.out.printf("%d ", i);
        }
        System.out.printf("\nSum: %d", sum);


    }
}
