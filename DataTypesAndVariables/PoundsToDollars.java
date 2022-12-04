package DataTypesAndVariables;

import java.util.Scanner;

public class PoundsToDollars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1 British Pound = 1.36 Dollars

        double brittPound = Double.parseDouble(scanner.nextLine());

        double usDollars = brittPound * 1.36;

        System.out.printf("%.3f", usDollars);
    }
}
