
import java.util.*;

public class ParkMaszynowy {
    public static void main(String[] args)
    {
        ArrayList<Integer> ParkMaszynowy = new ArrayList<Integer>();

        ParkMaszynowy.add(1);
        ParkMaszynowy.add(32);
        ParkMaszynowy.add(45);
        ParkMaszynowy.add(63);

        ParkMaszynowy.forEach(System.out::println);
    }
}