package FirstStepsInCoding;

import java.util.Scanner;

public class SuppliesForSchool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pens = Integer.parseInt(scanner.nextLine());
        int markers = Integer.parseInt(scanner.nextLine());
        int cleaner = Integer.parseInt(scanner.nextLine());
        int disc = Integer.parseInt(scanner.nextLine());

        double all = pens * 5.80 + markers * 7.20 + cleaner * 1.20;
        double total = all - (all * disc / 100);
        System.out.println(total);
    }
}
