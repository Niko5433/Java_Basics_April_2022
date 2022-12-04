package FirstStepsInCoding;

import java.util.Scanner;

public class RadiansToDegrease {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double Radians = Double.parseDouble(scanner.nextLine());
        double Degrease = Radians * 180 / Math.PI;
        System.out.println(Degrease);
    }
}
