package Exam;

import java.util.Scanner;

public class SumAndProduct {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        boolean isFound = false;


        for (int a = 1; a <= 9; a++) {
            for (int b = 9; b >= a; b--) {
                for (int c = 0; c <= 9; c++) {
                    for (int d = 9; d >= c; d--) {
                        if ((a + b + c + d) == (a * b * c * d) && num % 10 == 5) {
                            isFound = true;
                            System.out.printf("%d%d%d%d",a,b,c,d);
                            break;
                        } else if ((a * b * c * d) / (a + b + c + d) == 3 && num % 3 == 0) {
                            isFound = true;
                            System.out.printf("%d%d%d%d",d,c,b,a);
                            break;
                        }
                    }if (isFound){
                        break;
                    }

                }if (isFound){
                    break;
                }

            }if (isFound) {
                break;
            } else {
                System.out.println("Nothing found");
                break;
            }


        }
    }

}
