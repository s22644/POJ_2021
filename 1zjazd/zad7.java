package zadania;

import java.util.Scanner;

public class zad7 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.printf("Podaj wymiary 2 tablic: ");
        int n = s.nextInt();
        int m = s.nextInt();
        int A[] = new int[n];
        int B[] = new int[m];

        System.out.printf("Elementy 1 tablicy: ");
        for (int i = 0; i < n; i++) {
            A[i] = s.nextInt();
        }
        System.out.printf("Elementy 2 tablicy: ");
        for (int i = 0; i < m; i++) {
            B[i] = s.nextInt();
        }

        if (n > m || m > n) {
            System.out.println("BŁĄD");

        }
        else {
            int sum = 0;
            for (int i = 0; i < n; i++) {
                sum += A[i] * B[i];
            }
            System.out.println("Iloczyn skalarny = " + sum);
        }
    }
}

