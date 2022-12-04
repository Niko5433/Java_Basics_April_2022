package FirstStepsInCoding;

import java.util.Scanner;

public class PetShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dogsfood = Integer.parseInt (scanner.nextLine());
        int catsfood = Integer.parseInt (scanner.nextLine());
        double totaldogs = dogsfood * 2.50;
        double totalcats = catsfood * 4;
        double totalcost = totaldogs + totalcats;
        System.out.println(totalcost + " lv");
    }
}
