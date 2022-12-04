package FirstStepsInCoding;

import java.util.Scanner;

public class VacationBooksList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int PagesNow = Integer.parseInt(scanner.nextLine());
        int PagerHour = Integer.parseInt(scanner.nextLine());
        int Days = Integer.parseInt(scanner.nextLine());

        int TotalReading = PagesNow / PagerHour;
        int HourDay = TotalReading / Days;
        System.out.println(HourDay);
    }
}
