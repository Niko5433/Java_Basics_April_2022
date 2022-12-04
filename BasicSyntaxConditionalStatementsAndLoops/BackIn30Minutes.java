package BasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class BackIn30Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int iniHours = Integer.parseInt(scanner.nextLine());
        int iniMins = Integer.parseInt(scanner.nextLine());

        int allTime = (iniHours * 60) + iniMins + 30;

        int hours = allTime / 60;
        int min = allTime % 60;

        if (hours > 23){
            hours = 0;
        }

        System.out.printf("%d:%02d", hours , min);
    }
}
