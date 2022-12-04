package PBExamsTraining;

import java.util.Scanner;

public class FootballTournament {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int matches = Integer.parseInt(scanner.nextLine());

        int wins = 0;
        int ds = 0;
        int totalPoints = 0;

        for (int i = 0; i < matches; i++) {
            String result = scanner.nextLine();

            switch (result) {
                case "W":
                    totalPoints += 3;
                    wins++;
                    break;
                case "D":
                    totalPoints += 1;
                    ds++;
                    break;
            }

        }
        if (matches == 0) {
            System.out.printf("%s hasn't played any games during this season.", name);
        } else {
            double winRate = wins * 1.0 / matches * 100;
            System.out.printf("%s has won %d points during this season.\n", name, totalPoints);
            System.out.printf("Total stats:\n");
            System.out.printf("## W: %d\n", wins);
            System.out.printf("## D: %d\n", ds);
            System.out.printf("## L: %d\n", matches - wins - ds);
            System.out.printf("Win rate: %.2f%%", winRate);
        }
    }
}
