public class Pojazd extends Maszyna {
    protected rodzajSilnika rodzsil;
    protected double moc;
    protected double momentObrotowy;
    protected int nrPojazdu;
    protected static int maxLiczbaPojazdow = 0;


    public Pojazd(String marka, String nazwa, double pojemnoscSilnika, rodzajSilnika rodzsil, double momentObrotowy, double moc) {
        this.marka = marka;
        this.nazwa = nazwa;
        this.pojemnoscSilnika = pojemnoscSilnika;
        this.rodzsil = rodzsil;
        this.moc = moc;
        this.momentObrotowy = momentObrotowy;
        nrPojazdu=maxLiczbaPojazdow+1;
        maxLiczbaPojazdow++;
    }

    public String wyswietl3() {
        return "\nMarka: " + marka +
                " \nNazwa: " + nazwa +
                " \nPojemość silnika: " + pojemnoscSilnika +
                " \nRodzaj silnika: " + rodzsil +
                " \nMoc: " + moc +
                " \nMoment obrotowy: " + momentObrotowy +
                " \nPojazd " + nrPojazdu +
                " z " + maxLiczbaPojazdow;
    }
}