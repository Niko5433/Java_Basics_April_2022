package Exam;

import java.util.Scanner;

public class Exam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int student = Integer.parseInt(scanner.nextLine());

        int group1 = 0;
        int group2 = 0;
        int group3 = 0;
        int group4 = 0;
        double allGrades = 0;

        for (int i = 1; i <= student; i++) {
            double grade = Double.parseDouble(scanner.nextLine());

            allGrades += grade;

            if (grade < 3) {
                group1++;
            } else if (grade < 4) {
                group2++;
            } else if (grade < 5) {
                group3++;
            } else {
                group4++;
            }

        }
        System.out.printf("Top students: %.2f%%\n", group4 * 1.0 / student * 100);
        System.out.printf("Between 4.00 and 4.99: %.2f%%\n", group3 * 1.0 / student * 100);
        System.out.printf("Between 3.00 and 3.99: %.2f%%\n", group2 * 1.0 / student * 100);
        System.out.printf("Fail: %.2f%%\n", group1 * 1.0 / student * 100);
        System.out.printf("Average: %.2f", allGrades / student);

    }
}
