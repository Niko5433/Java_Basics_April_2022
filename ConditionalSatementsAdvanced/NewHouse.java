package ConditionalSatementsAdvanced;

import java.util.Scanner;

public class NewHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //•	Вид цветя - текст с възможности - "Roses", "Dahlias", "Tulips", "Narcissus", "Gladiolus"
        //•	Брой цветя - цяло число в интервала [10…1000]
        //•	Бюджет - цяло число в интервала [50…2500]

        String flower = scanner.nextLine();
        int amount = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());

        double priceRoses = 5;
        double priceDahlias = 3.80;
        double priceTulips = 2.80;
        double priceNarcissus = 3;
        double priceGladiolus = 2.50;

        double price = 0;

        switch (flower) {
            case "Roses":
                price = amount * priceRoses;
                if (amount > 80) {
                    price = price - (price * 0.10);
                }
                break;
            case "Dahlias":
                price = amount * priceDahlias;
                if (amount > 90) {
                    price = price - (price * 0.15);
                }
                break;
            case "Tulips":
                price = amount * priceTulips;
                if (amount > 80) {
                    price = price - (price * 0.15);
                }
                break;
            case "Narcissus":
                price = amount * priceNarcissus;
                if (amount < 120) {
                    price = price + (price * 0.15);
                }
                break;
            case "Gladiolus":
                price = amount * priceGladiolus;
                if (amount < 80) {
                    price = price + (price * 0.20);
                }
                break;
        }
        if (price <= budget) {
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", amount, flower, budget - price);
        } else {
            System.out.printf("Not enough money, you need %.2f leva more.", price - budget);
        }


    }
}
