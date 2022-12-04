package ForLoop;

import java.util.Scanner;

public class CleverLilly {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        double washmachine = Double.parseDouble(scanner.nextLine());
        int toyPrice = Integer.parseInt(scanner.nextLine());

        double sumMoney = 0;
        double toys = 0;
        int brother = 0;


        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                if (i % 2 == 2) {
                    sumMoney = 10;
                } else {
                    sumMoney += 10 * i / 2;
                }
                brother++;

            } else {
                toys++;
            }

        }
        double totToys = toys * toyPrice;
        double totSum = sumMoney + totToys - brother;

        if (totSum >= washmachine){
            System.out.printf("Yes! %.2f", totSum - washmachine);
        }else {
            System.out.printf("No! %.2f", washmachine - totSum);
        }

    }
}
