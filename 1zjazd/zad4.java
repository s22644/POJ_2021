package zadania;

import java.util.Scanner;

public class zad4 {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Podaj wymiary: ");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("TAK");
        }
        else if(a<=0 || b<=0 || c<=0){
            System.out.println("BŁĄD");
        }
        else{
            System.out.println("NIE");
        }
    }
}
