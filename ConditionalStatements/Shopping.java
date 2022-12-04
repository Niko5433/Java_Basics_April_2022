package ConditionalStatements;

import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1.	Бюджетът на Петър - реално число в интервала [0.0…100000.0]
        //2.	Броят видеокарти - цяло число в интервала [0…100]
        //3.	Броят процесори - цяло число в интервала [0…100]
        //4.	Броят рам памет - цяло число в интервала [0…100]

        double budget = Double.parseDouble(scanner.nextLine());
        int videocards = Integer.parseInt(scanner.nextLine());
        int processors = Integer.parseInt(scanner.nextLine());
        int ram = Integer.parseInt(scanner.nextLine());

        //•	Видеокарта – 250 лв./бр.
        //•	Процесор – 35% от цената на закупените видеокарти/бр.
        //•	Рам памет – 10% от цената на закупените видеокарти/бр.

        double priceVideocards = videocards * 250;
        double processorsPrice = priceVideocards * 0.35;
        double ramPrice = priceVideocards * 0.10;
        double totalProcessors = processors * processorsPrice;
        double totalRam = ram * ramPrice;
        double totalPrice = priceVideocards + totalProcessors + totalRam;

        if (videocards > processors) {
            totalPrice = totalPrice - (totalPrice * 0.15);
        }

        if (budget >= totalPrice) {
            System.out.printf("You have %.2f leva left!",Math.abs(budget - totalPrice) );
        }
        else {
            System.out.printf("Not enough money! You need %.2f leva more!", Math.abs(budget - totalPrice));
        }



    }
}
