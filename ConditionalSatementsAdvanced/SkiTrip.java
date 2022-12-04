package ConditionalSatementsAdvanced;

import java.util.Scanner;

public class SkiTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dayStaying = Integer.parseInt(scanner.nextLine());
        String kindRoom = scanner.nextLine();
        String rating = scanner.nextLine();

        double price = 0.0;

        if (kindRoom.equals("room for one person")) {
            int nights = dayStaying - 1;
            price = nights * 18;
            if (rating.equals("positive")) {
                price = price + (price * 0.25);
            } else {
                price = price - (price * 0.1);
            }
            System.out.printf("%.2f", price);
        } else if (kindRoom.equals("apartment")) {
            int nights = dayStaying - 1;
            price = nights * 25;
            if (dayStaying < 10) {
                price = price - (price * 0.3);
            } else if (dayStaying >= 10 && dayStaying <= 15) {
                price = price - (price * 0.35);
            } else {
                price = price - (price * 0.5);
            }
            if (rating.equals("positive")) {
                price = price + (price * 0.25);
            } else {
                price = price - (price * 0.1);
            }
            System.out.printf("%.2f", price);
        } else if (kindRoom.equals("president apartment")) {
            int nights = dayStaying - 1;
            price = nights * 35;
            if (dayStaying < 10) {
                price = price - (price * 0.1);
            } else if (dayStaying >= 10 && dayStaying <= 15) {
                price = price - (price * 0.15);
            } else {
                price = price - (price * 0.2);
            }
            if (rating.equals("positive")) {
                price = price + (price * 0.25);
            } else {
                price = price - (price * 0.1);
            }
            System.out.printf("%.2f", price);
        }

    }
}
