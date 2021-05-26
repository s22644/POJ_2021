package zadania;

import java.util.Scanner;

public class zad10 {
    public static void main(String args[]) {
        int i, j;
            System.out.printf("Wymiary macierzy: ");
            Scanner s = new Scanner(System.in);

        int x = s.nextInt();
        int y = s.nextInt();

        int matrix[][] = new int[x][y];
            System.out.printf("Dane w macierzy: ");
        for (i = 0; i < x; i++) {
            for (j = 0; j < y; j++) {
                matrix[i][j] = s.nextInt();
            }
        }
        System.out.println("Macierz przed transpozycją: ");
        for (i = 0; i < x; i++) {
            for (j = 0; j < y; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(" ");
        }
        System.out.println("Macierz po transpozycji: ");
        for (i = 0; i < y; i++) {
            for (j = 0; j < x; j++) {
                System.out.print(matrix[j][i] + " ");
            }
            System.out.println(" ");
        }
    }
}

