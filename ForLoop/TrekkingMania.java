package ForLoop;

import java.util.Scanner;

public class TrekkingMania {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int coutsGroup = Integer.parseInt(scanner.nextLine());

        int musala = 0;
        int montBlanc = 0;
        int kilimandjaro = 0;
        int k2 = 0;
        int everest = 0;

        double total = 0;

        for (int i = 1; i <= coutsGroup; i++) {
            int group = Integer.parseInt(scanner.nextLine());

            total += group;

            if (group <= 5) {
                musala += group;

            } else if (group <= 12) {
                montBlanc += group;
            } else if (group <= 25) {
                kilimandjaro += group;
            } else if (group <= 40) {
                k2 += group;
            } else {
                everest += group;
            }

        }
        System.out.printf("%.2f%%%n", musala / total * 100);
        System.out.printf("%.2f%%%n", montBlanc / total * 100);
        System.out.printf("%.2f%%%n", kilimandjaro / total * 100);
        System.out.printf("%.2f%%%n", k2 / total * 100);
        System.out.printf("%.2f%%%n", everest / total * 100);

    }
}
