package zadania;

import java.util.Scanner;

public class zad1 {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Podaj wymiary prostokąta: ");
        int a = scan.nextInt();
        int b = scan.nextInt();

        System.out.println("Pole prostokąta wynosi: " + a * b);
    }
}