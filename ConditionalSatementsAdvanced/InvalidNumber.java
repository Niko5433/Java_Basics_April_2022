package ConditionalSatementsAdvanced;

import java.util.Scanner;

public class InvalidNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        //Дадено число е валидно, ако е в диапазона [100…200] или е 0

        boolean isValid = (number >= 100 && number <= 200) || number == 0;
        if (!isValid){
            System.out.println("invalid");
        }

    }
}
