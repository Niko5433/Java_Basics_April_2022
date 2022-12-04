package ConditionalStatements;

import java.util.Scanner;

public class GreaterNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int Num1 = Integer.parseInt(scanner.nextLine());
        int Num2 = Integer.parseInt(scanner.nextLine());

        if (Num1 > Num2) {
            System.out.println(Num1);
        }
        else {
            System.out.println(Num2);
        }


    }

}
