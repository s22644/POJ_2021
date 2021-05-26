package zadania;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class zad15 {
    static boolean sprciag(String znak){
        Deque<Character> stack
                = new ArrayDeque<Character>();

        for (int i = 0; i < znak.length(); i++){

            char x = znak.charAt(i);

            if (x == '(' || x == '[' || x == '{'){
                stack.push(x);
                continue;
            }

            if (stack.isEmpty())
                return false;
            char sprawdz;
            switch (x) {
                case ')':
                    sprawdz = stack.pop();
                    if (sprawdz == '{' || sprawdz == '[')
                        return false;
                    break;

                case '}':
                    sprawdz = stack.pop();
                    if (sprawdz == '(' || sprawdz == '[')
                        return false;
                    break;

                case ']':
                    sprawdz = stack.pop();
                    if (sprawdz == '(' || sprawdz == '{')
                        return false;
                    break;
            }
        }
        return (stack.isEmpty());
    }
    public static void main(String[] args){

        String x;
        Scanner in = new Scanner(System.in);
        x = in.next();

        if (sprciag(x)) {
            System.out.println("TAK");
        }
        else {
            System.out.println("Nie");
        }
    }
}

