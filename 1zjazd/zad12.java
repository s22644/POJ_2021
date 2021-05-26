package zadania;

import java.util.Scanner;

public class zad12 {

        public static void main(String args[]) {
            java.text.DecimalFormat df = new java.text.DecimalFormat("000.00");
            Scanner scan = new Scanner(System.in);

            System.out.printf("Podaj swój wiek w sekundach: "); // Podawanie wieku w s
            float wiek = scan.nextInt();
            float obrot = 31557600;
            float ziemia = wiek / obrot;
            System.out.printf("Podaj nazwę planety: "); //Podawanie nazwy planety
            Scanner s = new Scanner(System.in);
            String planeta = s.nextLine();
            System.out.printf("Twój wiek na tej planecie wynosi: ");

            switch (planeta) {
                case "Merkury":
                    System.out.println(df.format(ziemia * 0.2408467));
                    break;
                case "Wenus":
                    System.out.println(df.format(ziemia * 0.61519726));
                    break;
                case "Ziemia":
                    System.out.println(df.format(ziemia));
                    break;
                case "Mars":
                    System.out.println(df.format(ziemia * 1.8808158));
                    break;
                case "Jowisz":
                    System.out.println(df.format(ziemia * 11.862615));
                    break;
                case "Saturn":
                    System.out.println(df.format(ziemia * 29.447498));
                    break;
                case "Uran":
                    System.out.println(df.format(ziemia * 84.016846));
                    break;
                case "Neptun":
                    System.out.println(df.format(ziemia * 164.79132));
                    break;
                default: {
                    System.out.println("BŁĄD");
                    break;
                }
            }
        }
    }

