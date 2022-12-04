package WhileLoop;

import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        while (true){
            int num = Integer.parseInt(scanner.nextLine());
            sum += num;

            if (sum >= number){
                break;
            }

        }System.out.println(sum);
    }
}
