package FirstStepsInCoding;

import java.util.Scanner;

public class UsdToBgn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Напишете програма за конвертиране на щатски долари (USD) в български лева (BGN).
        // Използвайте фиксиран курс между долар и лев: 1 USD = 1.79549 BGN.
        double USD = Double.parseDouble(scanner.nextLine());
        double BGN = USD * 1.79549;
        System.out.println(BGN);
    }
}
