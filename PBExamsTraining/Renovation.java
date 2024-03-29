package PBExamsTraining;

import java.util.Scanner;

public class Renovation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int height = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int percent = Integer.parseInt(scanner.nextLine());

        int total = height * width * 4;
        double toPaint = Math.ceil(total - total * 1.0 * percent / 100);

        String input = scanner.nextLine();

        while (!input.equals("Tired!")) {
            int liters = Integer.parseInt(input);
            toPaint -= liters;
            if (toPaint <= 0) {
                break;
            }
            input = scanner.nextLine();
        }
        if (toPaint == 0) {
            System.out.println("All walls are painted! Great job, Pesho!");
        } else if (toPaint > 0) {
            System.out.println(String.format("%.0f quadratic m left.", toPaint));
        } else {
            System.out.println(String.format("All walls are painted and you have %.0f l paint left!", toPaint * -1));
        }
    }
}
