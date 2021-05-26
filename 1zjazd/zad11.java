package zadania;

import java.util.Scanner;

public class zad11{

    public static boolean czyPangram(String str)
    {
        boolean[] mark = new boolean[26];
        int alf = 0;

        for (int i = 0; i < str.length(); i++) {

            if ('A' <= str.charAt(i) && str.charAt(i) <= 'Z')
                alf = str.charAt(i) - 'A';

            else if ('a' <= str.charAt(i) && str.charAt(i) <= 'z')

                alf = str.charAt(i) - 'a';

            else
                continue;
            mark[alf] = true;
        }

        for (int i = 0; i <= 25; i++)
            if (mark[i] == false)
                return (false);


        return (true);
    }

    public static void main(String[] args)
    {
        System.out.print("Wpisz zdanie aby sprawdzić czy jest pangramem: ");
        String x;
        Scanner in = new Scanner(System.in);
        x = in.next();
        if (czyPangram(x) == true)
            System.out.print("true");
        else
            System.out.print("false");
    }
}