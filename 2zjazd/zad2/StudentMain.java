package src.zad2;

public class StudentMain {

    public static void main(String[] args) {
        Student studentone = new Student("Alicja", "Manuszewska", 22644, 100, 4);
        studentone.setImie("");
        Student studenttwo = new Student(33544, 23, 5);
        Student studentthree = new Student("Kowalski", 34343, 80);

        System.out.println("---------------------------------------");
        System.out.println("Imię: ");
        System.out.println(studentone.getImie());
        System.out.println("Nazwisko: ");
        System.out.println(studentone.getNazwisko());
        System.out.println("Nr index: ");
        System.out.println(studentone.getNrIndex());
        System.out.println("Obecność: ");
        System.out.println(studentone.getObecnosc() + "%");
        System.out.println("Ocena: ");
        System.out.println(studentone.getOcenazPOJ());
        System.out.println("---------------------------------------");
        System.out.println("Imię: ");
        System.out.println(studenttwo.getImie());
        System.out.println("Nazwisko: ");
        System.out.println(studenttwo.getNazwisko());
        System.out.println("Nr index: ");
        System.out.println(studenttwo.getNrIndex());
        System.out.println("Obecność: ");
        System.out.println(studenttwo.getObecnosc() + "%");
        System.out.println("Ocena: ");
        System.out.println(studenttwo.getOcenazPOJ());
        System.out.println("---------------------------------------");
        System.out.println("Imię: ");
        System.out.println(studentthree.getImie());
        System.out.println("Nazwisko: ");
        System.out.println(studentthree.getNazwisko());
        System.out.println("Nr index: ");
        System.out.println(studentthree.getNrIndex());
        System.out.println("Obecność: ");
        System.out.println(studentthree.getObecnosc() + "%");
        System.out.println("Ocena: ");
        System.out.println(studentthree.getOcenazPOJ());
    }
}
