package ConditionalStatements;

import java.util.Scanner;

public class LunchBreak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //1.	Име на сериал – текст
        //2.	Продължителност на епизод  – цяло число в диапазона [10… 90]
        //3.	Продължителност на почивката  – цяло число в диапазона [10… 120]

        String serial = scanner.nextLine();
        int duration = Integer.parseInt(scanner.nextLine());
        int durationPause = Integer.parseInt(scanner.nextLine());

        double lunchTime = durationPause / 8.00;
        double freeTime = durationPause / 4.00;
        double restTime = durationPause - lunchTime - freeTime;

        if (restTime >= duration) {
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.",serial, Math.ceil(restTime - duration));
        }
        else {
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.", serial, Math.ceil(duration - restTime));

        }

    }
}
