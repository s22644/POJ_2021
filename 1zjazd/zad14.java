package zadania;

import java.util.Scanner;

public class zad14 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.printf("Podaj parę liczb naturalnych: ");
        int a = s.nextInt();
        int b = s.nextInt();
        int sum_a = 0;
        int sum_b = 0;
        for (int i = 1; i < a; i++) {
            if (a%i == 0) {
                sum_a += i;
            }
        }

        for (int i = 1; i < b; i++) {
            if (b%i == 0) {
                sum_b += i;
            }
        }

        if (sum_a == b && sum_b == a) {
            System.out.printf("TAK");
        }else{
            System.out.printf("NIE");
        }
    }
}

