package ConditionalSatementsAdvanced;

import java.util.Scanner;

public class FruitOrVegetable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();

        //•	Плодовете "fruit" са banana, apple, kiwi, cherry, lemon и grapes
        //•	Зеленчуците "vegetable" са tomato, cucumber, pepper и carrot
        //•	Всички останали са "unknown"

        if ("banana".equals(product) || "apple".equals(product) || "kiwi".equals(product) || "cherry".equals(product) || "lemon".equals(product) || "grapes".equals(product)) {
            System.out.println("fruit");
        } else if ("tomato".equals(product) || "cucumber".equals(product) || "pepper".equals(product) || "carrot".equals(product)) {
            System.out.println("vegetable");
        } else {
            System.out.println("unknown");
        }

    }
}
