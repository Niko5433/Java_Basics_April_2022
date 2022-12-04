package FirstStepsInCoding;

import java.util.Scanner;

public class BasketballEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tax = Integer.parseInt(scanner.nextLine());

        double priceshoe = tax - (tax * 0.40);
        double priceclother = priceshoe - (priceshoe * 0.20);
        double priceball = priceclother / 4;
        double priceaccessories = priceball / 5;

        double totalprice = tax + priceshoe + priceclother + priceball + priceaccessories;
        System.out.println(totalprice);




    }
}
