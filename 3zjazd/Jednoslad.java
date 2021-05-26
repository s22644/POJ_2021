public class Jednoslad extends Pojazd {

    enum Typ {ROWER, SKUTER, MOTOCYKL}

    private final Typ tp;
    protected int nrPojazdu;
    protected static int maxLiczbaPojazdow = 0;

    public Jednoslad(String marka, String nazwa, String typ, double pojemnoscSilnika, rodzajSilnika rodzsil, double moc, double momentObrotowy) {
        super(marka, nazwa, pojemnoscSilnika, rodzsil, moc, momentObrotowy);
        this.tp = Enum.valueOf(Jednoslad.Typ.class, typ.toUpperCase());
        nrPojazdu=maxLiczbaPojazdow+1;
        maxLiczbaPojazdow++;
    }
    public Jednoslad(String marka, String nazwa, String typ) {
        super(marka, nazwa, 0, rodzajSilnika.NIE_DOTYCZY, 0, 0);
        this.tp = Enum.valueOf(Jednoslad.Typ.class, typ.toUpperCase());
        nrPojazdu=maxLiczbaPojazdow+1;
        maxLiczbaPojazdow++;
    }
    public String wyswietl5() {
        return "Jednoślad" +
                "\nMarka: " + marka +
                " \nNazwa: " + nazwa +
                " \nTyp: " + tp +
                " \nPojemość silnika: " + pojemnoscSilnika +
                " \nRodzaj silnika: " + rodzsil +
                " \nMoc: " + moc +
                " \nMoment obrotowy: " + momentObrotowy +
                " \nPojazd " + nrPojazdu +
                " z " + maxLiczbaPojazdow;
        }
}