package zadania;

import java.util.Scanner;

public class zad9 {
    public static boolean pal(String word) {
        for (int i = 0, j = word.length() - 1; i < word.length() && j >= 0; i++, j--) {
            if (word.charAt(i) != word.charAt(j)) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj słowo: ");
        String test = scanner.nextLine();
        if (pal(test) == true) {
            System.out.println("TAK");
        } else {
            System.out.println("NIE");
        }
    }
}
