package FirstStepsInCoding;

import java.util.Scanner;

public class DepositCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //сума = депозирана сума  + срок на депозита * ((депозирана сума * годишен лихвен процент ) / 12)
        double Deposit = Double.parseDouble(scanner.nextLine());
        int term = Integer.parseInt(scanner.nextLine());
        double yearFee = Double.parseDouble(scanner.nextLine());
        double result = Deposit + term * ((Deposit * yearFee / 100) / 12);
        System.out.println(result);

    }
}
