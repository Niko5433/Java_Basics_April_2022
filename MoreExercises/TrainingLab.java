package MoreExercises;

import java.util.Scanner;

public class TrainingLab {
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

    int deskLength = 120;
    int deskWidth = 70;

    double roomLength = Double.parseDouble(scanner.nextLine())*100;
    double roomWidth = Double.parseDouble(scanner.nextLine())*100;

    roomWidth-=100;

    int desksPerRow = (int) roomWidth / deskWidth;
    int desksPerColumn = (int) roomLength / deskLength;

    int result = (desksPerColumn * desksPerRow) - 3;

    System.out.println(result);
    }
}
