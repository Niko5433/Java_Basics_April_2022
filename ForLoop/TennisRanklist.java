package ForLoop;

import java.util.Scanner;

public class TennisRanklist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tournaments = Integer.parseInt(scanner.nextLine());
        int startPoints = Integer.parseInt(scanner.nextLine());
        int points = 0;
        int total = 0;
        double wins = 0;

        for (int i = 1; i <= tournaments; i++) {
            String position = scanner.nextLine();

            total += 1;

            if (position.equals("W")) {
                points += 2000;
                wins += 1;
            } else if (position.equals("F")) {
                points += 1200;
            } else if (position.equals("SF")) {
                points += 720;
            }


        }int avarageWinPoints = points / total;


        System.out.printf("Final points: %d%n", startPoints + points);
        System.out.printf("Average points: %d%n", points / total);
        System.out.printf("%.2f%%", wins / total * 100);
    }
}
