package ConditionalSatementsAdvanced;

import java.util.Scanner;

public class TradeCommissions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String city = scanner.nextLine();
        double volume = Double.parseDouble(scanner.nextLine());

        if (volume > 0 && volume <= 500){
            switch (city) {
                case "Sofia":
                    System.out.printf("%.2f", volume * 0.05);
                    break;
                case "Varna":
                    System.out.printf("%.2f", volume * 0.045);
                    break;
                case "Plovdiv":
                    System.out.printf("%.2f", volume * 0.055);
                    break;
                default:
                    System.out.println("error");
            }
        }else if (volume > 500 && volume <= 1000) {
            switch (city) {
                case "Sofia":
                    System.out.printf("%.2f", volume * 0.07);
                    break;
                case "Varna":
                    System.out.printf("%.2f", volume * 0.075);
                    break;
                case "Plovdiv":
                    System.out.printf("%.2f", volume * 0.08);
                    break;
                default:
                    System.out.println("error");
            }
        }else if (volume > 1000 && volume <= 10000){
            switch (city) {
                case "Sofia":
                    System.out.printf("%.2f", volume * 0.08);
                    break;
                case "Varna":
                    System.out.printf("%.2f", volume * 0.10);
                    break;
                case "Plovdiv":
                    System.out.printf("%.2f", volume * 0.12);
                    break;
                default:
                    System.out.println("error");
            }
        }else if (volume > 10000){
            switch (city) {
                case "Sofia":
                    System.out.printf("%.2f", volume * 0.12);
                    break;
                case "Varna":
                    System.out.printf("%.2f", volume * 0.13);
                    break;
                case "Plovdiv":
                    System.out.printf("%.2f", volume * 0.145);
                    break;
                default:
                    System.out.println("error");
            }
        }else {
            System.out.println("error");
        }
    }
}
