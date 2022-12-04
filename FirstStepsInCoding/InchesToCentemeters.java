package FirstStepsInCoding;

import java.util.Scanner;

public class InchesToCentemeters {
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
//Да се напише програма, която чете от конзолата реално число и го преобразува от инчове в сантиметри.
// За целта умножете инчовете по 2.54 (1 инч = 2.54 сантиметра).
        double inch = Double.parseDouble (scanner.nextLine());
        double cm = inch * 2.54;
        System.out.println(cm);
    }
}
