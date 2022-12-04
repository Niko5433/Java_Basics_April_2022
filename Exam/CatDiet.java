package Exam;

import java.util.Scanner;

public class CatDiet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int percentFat = Integer.parseInt(scanner.nextLine());
        int percentProt = Integer.parseInt(scanner.nextLine());
        int percentCarbs = Integer.parseInt(scanner.nextLine());
        int calories = Integer.parseInt(scanner.nextLine());
        int percentWater = Integer.parseInt(scanner.nextLine());


        double totFat = ((calories * 1.0 * percentFat / 100) / 9);
        double totProt = ((calories * 1.0 * percentProt / 100) / 4);
        double totCarbs = ((calories * 1.0 * percentCarbs / 100) / 4);
        double foodWeight = totCarbs + totFat + totProt;
        double caloriesGram = calories / foodWeight;
        double gramWithoutWater = ((caloriesGram * 1.0 * percentWater / 100));
        double totGram = caloriesGram - gramWithoutWater;

        System.out.printf("%.4f", totGram);

    }
}
