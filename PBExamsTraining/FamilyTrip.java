package PBExamsTraining;

import java.util.Scanner;

public class FamilyTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int nights = Integer.parseInt(scanner.nextLine());
        double priceNights = Double.parseDouble(scanner.nextLine());
        int percentAddCosts = Integer.parseInt(scanner.nextLine());

        double discount = 0;
        double addCosts = budget * percentAddCosts / 100;

        double totalCosts = nights * priceNights + addCosts;

        if (nights > 7) {
            discount = priceNights * 0.05;
            totalCosts = totalCosts - discount * nights;
        }
        if (budget >= totalCosts) {
            System.out.printf("Ivanovi will be left with %.2f leva after vacation.", budget - totalCosts);
        } else {
            System.out.printf("%.2f leva needed.", Math.abs(budget - totalCosts));
        }
    }
}
