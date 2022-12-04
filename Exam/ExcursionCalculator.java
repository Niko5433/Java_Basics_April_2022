package Exam;

import java.util.Scanner;

public class ExcursionCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int people = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();

        double excurPrice = 0;

        switch (season) {
            case "spring":
                if (people <= 5) {
                    excurPrice = people * 50.00;
                } else {
                    excurPrice = people * 48;
                }
                break;
            case "summer":
                if (people <= 5) {
                    excurPrice = people * 48.50;
                    excurPrice = excurPrice - (excurPrice * 0.15);
                } else {
                    excurPrice = people * 45.00;
                    excurPrice = excurPrice - (excurPrice * 0.15);
                }
                break;
            case "autumn":
                if (people <= 5) {
                    excurPrice = people * 60;
                } else {
                    excurPrice = people * 49.50;
                }
                break;
            case "winter":
                if (people <= 5) {
                    excurPrice = people * 86;
                    excurPrice = excurPrice + (excurPrice * 0.08);
                } else {
                    excurPrice = people * 85;
                    excurPrice = excurPrice + (excurPrice * 0.08);
                }
                break;
        }
        System.out.printf("%.2f leva.", excurPrice);
    }
}
