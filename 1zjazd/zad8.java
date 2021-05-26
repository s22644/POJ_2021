package zadania;

import java.util.Scanner;

public class zad8 {
    public static void main(String args[]) {
        char g = '*';
        System.out.printf("Podaj liczbe: ");
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();

            for (int i = 1; i <= a; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(g + " ");
                }
                System.out.println();
            }
            for (int i = a; i >= 1; i--) {
                for (int j = i; j >= 1; j--) {
                    System.out.print(g + " ");
                }
                System.out.println();
            }
            for (int i = a; i >= 1; i--) {
                for (int j = i; j >= 1; j--) {
                    System.out.print(g + " ");
                }
                System.out.println();
            }
            for (int i = 1; i <= a; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.println(g + " ");
                }
                System.out.println();
            }

        }

}