package NestenLoops;

import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int beginn = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());
        int magicNumber = Integer.parseInt(scanner.nextLine());

        int counter = 0;
        boolean isEquals = false;

        for (int i = beginn; i <= end; i++) {
            for (int j = beginn; j <= end; j++) {
                counter++;
                if (i + j == magicNumber) {
                    System.out.printf("Combination N:%d ", counter);
                    System.out.printf("(%d + %d = %d)", i, j, i + j);
                    isEquals = true;
                    break;
                }


            }
            if (isEquals) {
                break;
            }
        }
        if (!isEquals) {
            System.out.printf("%d combinations - neither equals %d", counter, magicNumber);

        }

    }
}
