package src.zad2;

public class Student {
    private String imie = "Unknown";
    private String nazwisko = "Unknown";
    private int nrIndex;
    private int obecnosc;
    private int ocenazPOJ;

    Student(String imie, String nazwisko, int nrIndex, int obecnosc, int ocenaPOJ) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.nrIndex = nrIndex;
        this.ocenazPOJ = ocenaPOJ;
        setObecnosc(obecnosc);
    }

    Student(int nrIndex, int obecnosc, int ocenaPOJ) {
        this.nrIndex = nrIndex;
        this.ocenazPOJ = ocenaPOJ;
        setObecnosc(obecnosc);
    }

    Student(String nazwisko, int nrIndex, int obecnosc) {
        this.nazwisko = nazwisko;
        this.nrIndex = nrIndex;
        setObecnosc(obecnosc);
    }

    Student(int nrIndex, int obecnosc) {
        this.nrIndex = nrIndex;
        setObecnosc(obecnosc);
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public void setNrIndex(int nrIndex) {
        this.nrIndex = nrIndex;
    }

    public void setObecnosc(int obecnosc) {
        this.obecnosc = obecnosc;
        if (obecnosc < 50) {
            setOcenazPOJ(2);
        }
    }

    public void setOcenazPOJ(int ocenaPOJ) {
        this.ocenazPOJ = ocenaPOJ;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public int getNrIndex() {
        return nrIndex;
    }

    public int getObecnosc() {
        return obecnosc;
    }

    public int getOcenazPOJ() {
        return ocenazPOJ;
    }
}





