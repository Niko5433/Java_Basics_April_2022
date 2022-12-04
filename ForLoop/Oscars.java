package ForLoop;

import java.util.Scanner;

public class Oscars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        double academyPoints = Double.parseDouble(scanner.nextLine());
        int numberOfJudges = Integer.parseInt(scanner.nextLine());

        double points = 0;
        double sum = 0;

        for (int i = 1; i <= numberOfJudges; i++) {

            String nameOfJudge = scanner.nextLine();
            double pointsFromJudge = Double.parseDouble(scanner.nextLine());

            points = academyPoints + ((nameOfJudge.length() * pointsFromJudge) / 2);

            sum += points;

            academyPoints = points;

            if (academyPoints > 1250.5) {
                break;
            }
        }
        double pointsNeeded = 1250.5 - points;

        if (points > 1250.5) {
            System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", name, points);

        } else {
            System.out.printf("Sorry, %s you need %.1f more!", name, pointsNeeded);
        }
    }
}
