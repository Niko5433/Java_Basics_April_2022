package ConditionalSatementsAdvanced;

import java.util.Scanner;

public class FishingBoat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int fishers = Integer.parseInt(scanner.nextLine());

        double priceShip = 0;

        switch (season) {
            case "Spring":
                priceShip = 3000;
                if (fishers <= 6) {
                    priceShip = priceShip - (priceShip * 0.10);
                } else if (fishers <= 11) {
                    priceShip = priceShip - (priceShip * 0.15);
                } else {
                    priceShip = priceShip - (priceShip * 0.25);
                }
                break;
            case "Summer":
                priceShip = 4200;
                if (fishers <= 6) {
                    priceShip = priceShip - (priceShip * 0.10);
                } else if (fishers <= 11) {
                    priceShip = priceShip - (priceShip * 0.15);
                } else {
                    priceShip = priceShip - (priceShip * 0.25);
                }
                break;
            case "Autumn":
                priceShip = 4200;
                if (fishers <= 6) {
                    priceShip = priceShip - (priceShip * 0.10);
                } else if (fishers <= 11) {
                    priceShip = priceShip - (priceShip * 0.15);
                } else {
                    priceShip = priceShip - (priceShip * 0.25);
                }
                break;
            case "Winter":
                priceShip = 2600;
                if (fishers <= 6) {
                    priceShip = priceShip - (priceShip * 0.10);
                } else if (fishers <= 11) {
                    priceShip = priceShip - (priceShip * 0.15);
                } else {
                    priceShip = priceShip - (priceShip * 0.25);
                }
                break;
        }
        if (season.equals("Spring") || season.equals("Summer") || season.equals("Winter")) {
            if (fishers % 2 == 0){
                priceShip = priceShip - (priceShip * 0.05);
            }
        }
        if (budget >= priceShip){
            System.out.printf("Yes! You have %.2f leva left.", budget - priceShip );
        }else {
            System.out.printf("Not enough money! You need %.2f leva.", priceShip - budget);
        }


    }
}
