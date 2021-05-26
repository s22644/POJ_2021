package zadania;

import java.util.Scanner;

public class zad6 {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Podaj 3 liczby do porównania: ");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();


        if ((a == c) && (b == c)) {
            System.out.println(a + " " + b + " " + c);
        } else if ((a == b) && (a < c)) {
            System.out.println(a + " " + b + " " + c);
            System.out.println(c + " " + b + " " + a);
        } else if ((a == b) && (a > c)) {
            System.out.println(c + " " + b + " " + a);
            System.out.println(a + " " + b + " " + c);
        } else if ((a == c) && (a < b)) {
            System.out.println(a + " " + c + " " + b);
            System.out.println(b + " " + c + " " + a);
        } else if ((a == c) && (a > b)) {
            System.out.println(b + " " + a + " " + c);
            System.out.println(c + " " + a + " " + b);
        } else if ((b == c) && (b < a)) {
            System.out.println(c + " " + b + " " + a);
            System.out.println(a + " " + b + " " + c);
        } else if ((b == c) && (b > a)) {
            System.out.println(a + " " + b + " " + c);
            System.out.println(c + " " + b + " " + a);
        }else if ((a > b) && (a > c) && (b > c)) {
            System.out.println(c + " " + b + " " + a);
            System.out.println(a + " " + b + " " + c);
        }
        else if ((b > a) && (b > c) && (a > c)) {
            System.out.println(c + " " + a + " " + b);
            System.out.println(b + " " + a + " " + c);
        }
        else if ((c > b) && (c > a) && (b > a)) {
            System.out.println(a + " " + b + " " + c);
            System.out.println(c + " " + b + " " + a);
        }
        else if ((c > b) && (c > a) && (a > b)) {
            System.out.println(b + " " + a + " " + c);
            System.out.println(c + " " + a + " " + b);
        }
    }
}