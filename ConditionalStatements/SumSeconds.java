package ConditionalStatements;

import java.util.Scanner;

public class SumSeconds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int TimeFirst = Integer.parseInt(scanner.nextLine());
        int TimeSecond = Integer.parseInt(scanner.nextLine());
        int TimeThird = Integer.parseInt(scanner.nextLine());
        int TotalTime = TimeFirst + TimeSecond + TimeThird;

        int minutes = TotalTime / 60;
        int seconds = TotalTime % 60;

        if (seconds < 10) {
            System.out.printf("%d:0%d", minutes, seconds);

        }
        else {
            System.out.printf("%d:%d", minutes, seconds);
        }



    }
}
