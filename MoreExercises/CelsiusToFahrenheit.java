package MoreExercises;

import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //T (° F) = T (° C) × 1,8 + 32

        double C = Double.parseDouble(scanner.nextLine());

        double F = C * 1.8 + 32;

        System.out.printf("%.2f", F);




    }
}
