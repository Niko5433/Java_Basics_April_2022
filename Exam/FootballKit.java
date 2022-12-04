package Exam;

import java.util.Scanner;

public class FootballKit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceTshirt = Double.parseDouble(scanner.nextLine());
        double targetPrice = Double.parseDouble(scanner.nextLine());

        double priceLegs = priceTshirt * 0.75;
        double priceSocks = priceLegs * 0.20;
        double priceShoes = (priceTshirt + priceLegs) * 2;

        double totPrice = priceTshirt + priceLegs + priceSocks + priceShoes;
        double sumAfterDiscount = totPrice - (totPrice * 0.15);

        if (sumAfterDiscount >= targetPrice) {
            System.out.println("Yes, he will earn the world-cup replica ball!");
            System.out.printf("His sum is %.2f lv.", sumAfterDiscount);
        } else {
            System.out.println("No, he will not earn the world-cup replica ball.");
            System.out.printf("He needs %.2f lv. more.", Math.abs(targetPrice - sumAfterDiscount));
        }
    }
}
