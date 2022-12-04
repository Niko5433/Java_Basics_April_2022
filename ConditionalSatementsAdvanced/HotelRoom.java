package ConditionalSatementsAdvanced;

import java.util.Scanner;

public class HotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String month = scanner.nextLine();
        int nights = Integer.parseInt(scanner.nextLine());

        double priceStudio = 0;
        double priceApartment = 0;

        if (month.equals("May") || month.equals("October")) {
            priceStudio = nights * 50;
            priceApartment = nights * 65;
            if (nights > 7 && nights <= 14) {
                priceStudio = priceStudio - (priceStudio * 0.05);
            } else if (nights > 14) {
                priceStudio = priceStudio - (priceStudio * 0.3);
                priceApartment = priceApartment - (priceApartment * 0.1);
            }
            System.out.printf("Apartment: %.2f lv. %n", priceApartment);
            System.out.printf("Studio: %.2f lv.", priceStudio);
        }

        if (month.equals("June") || month.equals("September")) {
            priceStudio = nights * 75.20;
            priceApartment = nights * 68.70;
            if (nights > 14) {
                priceStudio = priceStudio - (priceStudio * 0.2);
                priceApartment = priceApartment - (priceApartment * 0.1);
            }
            System.out.printf("Apartment: %.2f lv. %n", priceApartment);
            System.out.printf("Studio: %.2f lv.", priceStudio);
        }
        if (month.equals("July") || month.equals("August")) {
            priceStudio = nights * 76;
            priceApartment = nights * 77;
            if (nights > 14) {
                priceApartment = priceApartment - (priceApartment * 0.1);
            }
            System.out.printf("Apartment: %.2f lv. %n", priceApartment);
            System.out.printf("Studio: %.2f lv.", priceStudio);
        }

    }
}
