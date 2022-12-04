package FirstStepsInCoding;

import java.util.Scanner;

public class FishTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lenght = Integer.parseInt(scanner.nextLine());
        int wight = Integer.parseInt(scanner.nextLine());
        int hight = Integer.parseInt(scanner.nextLine());
        double procent = Double.parseDouble(scanner.nextLine());

        int volume = lenght * wight * hight;
        double liter = volume / 1000.0;
        double space = procent / 100.0;

        double litertotal = liter * (1 - space);

        System.out.println(litertotal);



    }
}
