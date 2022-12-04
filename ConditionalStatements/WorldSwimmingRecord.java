package ConditionalStatements;

import java.util.Scanner;

public class WorldSwimmingRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1.	Рекордът в секунди – реално число в интервала [0.00 … 100000.00]
        //2.	Разстоянието в метри – реално число в интервала [0.00 … 100000.00]
        //3.	Времето в секунди, за което плува разстояние от 1 м. - реално число в интервала [0.00 … 1000.00]

        double recordSec = Double.parseDouble(scanner.nextLine());
        double rangeMeter = Double.parseDouble(scanner.nextLine());
        double swimTimeSec = Double.parseDouble(scanner.nextLine());

        double totalRange = rangeMeter * swimTimeSec;
        double totalRange2 = Math.floor(rangeMeter / 15) * 12.5;

        double totalTime = totalRange + totalRange2;

        if (totalTime < recordSec) {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", totalTime);
        }
        else
            System.out.printf("No, he failed! He was %.2f seconds slower.", Math.abs(recordSec - totalTime));


    }
}
