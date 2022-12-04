package WhileLoop;

import java.util.Scanner;

public class Graduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int goodGrades = 0;
        int poorGrades = 0;
        double allGrades = 0;
        int gradeCounter = 1;

        while (goodGrades < 12) {

            if (poorGrades == 2) {
                break;
            }
            double currentGrade = Double.parseDouble(scanner.nextLine());

            if (currentGrade < 4) {
                poorGrades++;
                continue;
            }
            goodGrades++;
            allGrades += currentGrade;
            gradeCounter++;

        }
        if (gradeCounter >= 12) {
            System.out.printf("%s graduated. Average grade: %.2f%n", name, allGrades / goodGrades);
        } else {
            System.out.printf("%s has been excluded at %d grade", name, gradeCounter);
        }


    }
}
