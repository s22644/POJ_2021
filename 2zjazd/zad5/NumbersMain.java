package src.zad5;


import java.text.DecimalFormat;
import java.util.Scanner;

public class NumbersMain {
        public static void main(String[] args) {
            java.text.DecimalFormat wzor = new DecimalFormat("0.00");
            Scanner scanner = new Scanner(System.in);
            System.out.print("Podaj 3 liczby: ");
            Numbers man = new Numbers();
            int a,b,c;

            a = scanner.nextInt();
            b = scanner.nextInt();
            c = scanner.nextInt();
            
            man.seta(a);
            man.setb(b);
            man.setc(c);

            System.out.println("Sum = "+ man.sum());
            System.out.println("Average = "+ wzor.format(man.average()));
            System.out.println("Min = "+ man.min());
            System.out.println("Geometric = "+wzor.format(man.geometric()));


        }
    }

