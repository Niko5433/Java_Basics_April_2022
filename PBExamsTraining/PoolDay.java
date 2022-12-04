package PBExamsTraining;

import java.util.Scanner;

public class PoolDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int people = Integer.parseInt(scanner.nextLine());
        double tax = Double.parseDouble(scanner.nextLine());
        double taxDeckChair = Double.parseDouble(scanner.nextLine());
        double taxUmbrella = Double.parseDouble(scanner.nextLine());

        double taxEntrance = people * tax;
        double totalDeckchair =Math.ceil(people * 0.75);
        double totalUmbrella = Math.ceil(people * 0.50);

        System.out.printf("%.2f lv.", taxEntrance + totalUmbrella * taxUmbrella + totalDeckchair * taxDeckChair);

    }
}
