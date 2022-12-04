package FirstStepsInCoding;

import java.util.Scanner;

public class FoodDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int chickenmenu = Integer.parseInt(scanner.nextLine());
        int fishmenu = Integer.parseInt(scanner.nextLine());
        int veganmenu = Integer.parseInt(scanner.nextLine());

        //•	Пилешко меню –  10.35 лв.
        //•	Меню с риба – 12.40 лв.
        //•	Вегетарианско меню  – 8.15 лв.

        double pricechicken = chickenmenu * 10.35;
        double pricefish = fishmenu * 12.40;
        double pricevegan = veganmenu * 8.15;
        double TotPriceMenu = pricechicken + pricefish + pricevegan;

        double desert = TotPriceMenu * 0.2;

        double Total = TotPriceMenu + desert + 2.50;

        System.out.println(Total);


    }
}
