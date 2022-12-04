package DataTypesAndVariables;

import java.util.Scanner;

public class ConvertMetersToKilometers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int distanceM = Integer.parseInt(scanner.nextLine());

        double distanceKm = distanceM / 1000.0;

        System.out.printf("%.2f", distanceKm);
    }
}
