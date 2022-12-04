package BasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        String type = scanner.nextLine();
        String day = scanner.nextLine();

        double price = 0;
        double totPrice = 0;

        if (day.equals("Friday")) {
            if (type.equals("Students")) {
                price = 8.45;
                totPrice = num * price;
                if (num >= 30) {
                    totPrice = totPrice - (totPrice * 0.15);
                }
            } else if (type.equals("Business")) {
                price = 10.90;
                totPrice = num * price;
                if (num >= 100){
                    totPrice = totPrice - (price * 10);
                }
            } else if (type.equals("Regular")) {
                price = 15;
                totPrice = num * price;
                if (num >= 10 && num <= 20){
                    totPrice = totPrice - (totPrice * 0.05);
                }
            }


        } else if (day.equals("Saturday")) {
            if (type.equals("Students")) {
                price = 9.80;
                totPrice = num * price;
                if (num >= 30) {
                    totPrice = totPrice - (totPrice * 0.15);
                }
            } else if (type.equals("Business")) {
                price = 15.60;
                totPrice = num * price;
                if (num >= 100){
                    totPrice = totPrice - (price * 10);
                }
            } else if (type.equals("Regular")) {
                price = 20;
                totPrice = num * price;
                if (num >= 10 && num <= 20){
                    totPrice = totPrice - (totPrice * 0.05);
                }
            }

        } else if (day.equals("Sunday")) {
            if (type.equals("Students")) {
                price = 10.46;
                totPrice = num * price;
                if (num >= 30) {
                    totPrice = totPrice - (totPrice * 0.15);
                }
            } else if (type.equals("Business")) {
                price = 16;
                totPrice = num * price;
                if (num >= 100){
                    totPrice = totPrice - (price * 10);
                }
            } else if (type.equals("Regular")) {
                price = 22.50;
                totPrice = num * price;
                if (num >= 10 && num <= 20){
                    totPrice = totPrice - (totPrice * 0.05);
                }
            }

        }
        System.out.printf("Total price: %.2f", totPrice);

    }
}
