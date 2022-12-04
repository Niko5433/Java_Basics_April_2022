package Exam;

import java.util.Scanner;

public class BestPlayer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int maxGoals = Integer.MIN_VALUE;
        String maxName = null;

        while (!name.equals("END")) {
            int goals = Integer.parseInt(scanner.nextLine());
            String currentName = name;

            if (goals > maxGoals) {
                maxGoals = goals;
                maxName = currentName;

            }
            if (maxGoals >= 10) {
                break;
            }
            name = scanner.nextLine();

        }
        if (maxGoals >= 3) {
            System.out.printf("%s is the best player!\n", maxName);
            System.out.printf("He has scored %d goals and made a hat-trick !!!", maxGoals);
        } else {
            System.out.printf("%s is the best player!\n", maxName);
            System.out.printf("He has scored %d goals.", maxGoals);
        }

    }
}
