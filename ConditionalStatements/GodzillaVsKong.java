package ConditionalStatements;

import java.util.Scanner;

public class GodzillaVsKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Ред 1.	Бюджет за филма – реално число в интервала [1.00 … 1000000.00]
        //Ред 2.	Брой на статистите – цяло число в интервала [1 … 500]
        //Ред 3.	Цена за облекло на един статист – реално число в интервала [1.00 … 1000.00]

        double budjet = Double.parseDouble(scanner.nextLine());
        int statist = Integer.parseInt(scanner.nextLine());
        double priceClothes = Double.parseDouble(scanner.nextLine());

        //На конзолата трябва да се отпечатат два реда:
        //•	Ако  парите за декора и дрехите са повече от бюджета:
        //o	"Not enough money!"
        //o	"Wingard needs {парите недостигащи за филма} leva more."
        //•	Ако парите за декора и дрехите са по малко или равни на бюджета:
        //o	"Action!"
        //o	"Wingard starts filming with {останалите пари} leva left."

        double sumDecor = budjet * 0.10;
        double sumClothes = statist * priceClothes;

        if (statist > 150){
            sumClothes = sumClothes - (sumClothes * 0.1);
        }

        double totalSum = sumClothes + sumDecor;


        if (totalSum > budjet) {
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", Math.abs(totalSum - budjet));
        }
        else {
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", Math.abs(totalSum - budjet));
        }


    }
}
