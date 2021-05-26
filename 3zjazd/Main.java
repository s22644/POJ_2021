public class Main {

    public static void main(String[] args) {
        Lokomotywa loko1 = new Lokomotywa("Henschel", "Baureihe", 6.2, 312, 3, Maszyna.rodzajSilnika.BENZYNA);
        Lokomotywa loko2 = new Lokomotywa("Siemens", "Vectron", 6.4, 400, 5, Maszyna.rodzajSilnika.BENZYNA);
        Lokomotywa loko3 = new Lokomotywa("Shinkansen", "seria 300", 10, 500, 8, Maszyna.rodzajSilnika.ELEKTRYCZNY);
        System.out.println("Lokomotywa1: \n" + loko1.wyswietl1());
        System.out.println("Lokomotywa2: \n" + loko2.wyswietl1());
        System.out.println("Lokomotywa3: \n" + loko3.wyswietl1());
        System.out.println("-----------------------------------------------------------------------------");

        Kosiarka kosiarz = new Kosiarka(true, false, 1, "Bosh", "B52", 0.8, Maszyna.rodzajSilnika.ELEKTRYCZNY);
        System.out.println(kosiarz.wyswietl2());
        Kosiarka kosiareczka = new Kosiarka(false, true, 2, "Still", "K20", 0.5, Maszyna.rodzajSilnika.BENZYNA);
        System.out.println(kosiareczka.wyswietl2());
        System.out.println("-----------------------------------------------------------------------------");

        Pojazd auto1 = new Pojazd("OPEL", "CORSA",1.4, Maszyna.rodzajSilnika.BENZYNA, 40, 78);
        Pojazd auto2 = new Pojazd("HONDA", "CIVIC",1.6, Maszyna.rodzajSilnika.DIESEL, 8,9);
        Pojazd auto3 = new Pojazd("AUDI", "RS7",4.0, Maszyna.rodzajSilnika.BENZYNA,8,7);

        System.out.println("AUTO1: " + auto1.wyswietl3());
        System.out.println("AUTO2: " + auto2.wyswietl3());
        System.out.println("AUTO3: " + auto3.wyswietl3());
        System.out.println("-----------------------------------------------------------------------------");

        Samochod samochod1 = new Samochod("TOYOTA", "YARIS", 1.6, Maszyna.rodzajSilnika.DIESEL, 345, 20, 2895, Samochod.segment.R);
        Samochod samochod2 = new Samochod("TESLA", "ELEKTRA", 3.0, Maszyna.rodzajSilnika.ELEKTRYCZNY, 234, 10, 3626, Samochod.segment.W);
        System.out.println("Samochód: " + samochod1.wyswietl4());
        System.out.println("Samochód: " + samochod2.wyswietl4());
        System.out.println("-----------------------------------------------------------------------------");

        Jednoslad jednoslad1 = new Jednoslad("Romet", "B53", "rower");
        Jednoslad jednoslad2 = new Jednoslad("WSK", "Mo6B3", "MOTOCYKL", 123, Maszyna.rodzajSilnika.BENZYNA, 7.3, 9.8);
        System.out.println(jednoslad1.wyswietl5());
        System.out.println(jednoslad2.wyswietl5());
        System.out.println("-----------------------------------------------------------------------------");


    }
}
