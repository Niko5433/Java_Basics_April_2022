package PBExamsTraining;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String drinks = scanner.nextLine();
        String sugar = scanner.nextLine();
        int number = Integer.parseInt(scanner.nextLine());

        double totalPrice = 0;

        switch (drinks) {
            case "Espresso":
                if (sugar .equals("Without")){
                    totalPrice = number * 0.90;
                    totalPrice = totalPrice - (totalPrice * 0.35);
                } else if (sugar.equals("Normal")){
                    totalPrice = number * 1;
                }else if (sugar.equals("Extra")){
                    totalPrice = number * 1.2;
                }
                break;

            case "Cappuccino":
                if (sugar .equals("Without")){
                    totalPrice = number * 1;
                    totalPrice = totalPrice - (totalPrice * 0.35);
                } else if (sugar.equals("Normal")){
                    totalPrice = number * 1.20;
                }else if (sugar.equals("Extra")){
                    totalPrice = number * 1.60;
                }
                break;
            case "Tea":
                if (sugar .equals("Without")){
                    totalPrice = number * 0.5;
                    totalPrice = totalPrice - (totalPrice * 0.35);
                } else if (sugar.equals("Normal")){
                    totalPrice = number * 0.6;
                }else if (sugar.equals("Extra")){
                    totalPrice = number * 0.7;
                }
                break;

        }if (number > 5 && drinks.equals("Espresso")){
            totalPrice = totalPrice - (totalPrice * 0.25);
        }if (totalPrice > 15){
            totalPrice = totalPrice - (totalPrice * 0.2);
        }
        System.out.printf("You bought %d cups of %s for %.2f lv.", number , drinks , totalPrice);
    }
}
