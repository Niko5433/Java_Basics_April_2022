package BasicSyntaxConditionalStatementsAndLoops;

import ConditionalSatementsAdvanced.SummerOutfit;

import java.util.Scanner;

public class TheatrePromotion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String day = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());

        int money = 0;
        boolean isValid = false;

        if (age >= 0 && age <= 18) {
            if (day.equals("Weekday")) {
                money = 12;
            } else if (day.equals("Weekend")) {
                money = 15;
            } else if (day.equals ("Holiday")) {
                money = 5;
            }

        } else if (age > 18 && age <= 64) {
            if (day.equals("Weekday")) {
                money = 18;
            } else if (day.equals("Weekend")) {
                money = 20;
            } else if (day.equals ("Holiday")) {
                money = 12;
            }
        } else if (age > 64 && age <= 122) {
            if (day.equals("Weekday")) {
                money = 12;
            } else if (day.equals("Weekend")) {
                money = 15;
            } else if (day.equals ("Holiday")) {
                money = 10;
            }
        } else {
            isValid = true;
        }
        if (isValid){
            System.out.println("Error!");
        }else {
            System.out.println(money + "$");
        }
    }
}
