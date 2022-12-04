package FirstStepsInCoding;

import java.util.Scanner;

public class Repainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int naylon = Integer.parseInt(scanner.nextLine());
        int paint = Integer.parseInt(scanner.nextLine());
        int thinner = Integer.parseInt(scanner.nextLine());
        int workhours = Integer.parseInt(scanner.nextLine());

        int totalnylon = naylon + 2;
        double totalpaint = paint + (paint * 0.1);

        double pricenylon = totalnylon * 1.50;
        double pricepaint = totalpaint * 14.50;
        double pricethinner = thinner * 5;

        double priceM = pricenylon + pricepaint + pricethinner + 0.40;
        double priceWorkman = (priceM * 0.30) * workhours;

        double totalprice = priceM + priceWorkman;

        System.out.println(totalprice);


    }
}

