package MoreExercises;

import java.util.Scanner;

public class VegetableMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //•	Първи ред – Цена за килограм зеленчуци – реално число[0.00… 1000.00]
        //•	Втори ред – Цена за килограм плодове – реално число[0.00… 1000.00]
        //•	Трети ред – Общо килограми на зеленчуците – цяло число[0… 1000]
        //•	Четвърти ред – Общо килограми на плодовете – цяло число[0… 1000]

        double PriceKgVeg = Double.parseDouble(scanner.nextLine());
        double PriceKgFruit = Double.parseDouble(scanner.nextLine());
        int kgVeg = Integer.parseInt(scanner.nextLine());
        int kgFruit = Integer.parseInt(scanner.nextLine());

        double PriceVeg = PriceKgVeg * kgVeg;
        double PriceFruit = PriceKgFruit * kgFruit;

        double TotalBGN = PriceVeg + PriceFruit;
        double TotalEUR = TotalBGN / 1.94;

        System.out.printf("%.2f", TotalEUR);


    }
}
