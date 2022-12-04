package FirstStepsInCoding;

import java.util.Scanner;

public class YardGreening {
    public static void main(String[] args) {
        //•	"The final price is: {крайна цена на услугата} lv."
        //•	"The discount is: {отстъпка} lv."
        Scanner scanner = new Scanner (System.in);
        double Meter = Double.parseDouble(scanner.nextLine());
        double GreeningPrice = Meter * 7.61;
        double Disc = GreeningPrice * 0.18;
        double EndPrice = GreeningPrice - Disc;
        System.out.printf("The final price is: %f lv.", EndPrice);
        System.out.printf("The discount is: %f lv.", Disc);

    }
}
