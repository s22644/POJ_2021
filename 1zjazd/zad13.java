package zadania;

import java.util.Scanner;

public class zad13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.printf("Dlugość tablicy: ");
        int n = scan.nextInt();
        int[] tab = new int [n];
        System.out.printf("Elementy tablicy: ");
        for(int i = 0; i<n; i++) {
            tab[i] = scan.nextInt();
        }
        int max = tab[0];
        for (int i = 0; i < n; i++) {
            if (tab[i] > max)
                max = tab[i];
        }
        System.out.println(max);
    }
}




