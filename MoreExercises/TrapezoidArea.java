package MoreExercises;

import java.util.Scanner;

public class TrapezoidArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //(b1 + b2) * h / 2.

        double b1 = Double.parseDouble(scanner.nextLine());
        double b2 = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());

        double S = (b1 + b2) * h / 2;

        System.out.printf ("%.2f", S);




    }

}
