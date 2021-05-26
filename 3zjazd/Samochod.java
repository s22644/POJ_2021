public class Samochod extends Pojazd {
    enum segment{Q, W, E, R, T, Y}
    private final segment seg;
    private final long VIN;
    protected int nrPojazdu;
    protected static int maxLiczbaPojazdow = 0;

    public Samochod(String marka, String nazwa, double pojemnoscSilnika, rodzajSilnika rodzsil, double moc, double momentObrotowy, long VIN, segment seg) {
        super(marka, nazwa, pojemnoscSilnika, rodzsil, moc, momentObrotowy);
        this.seg = seg;
        this.VIN = VIN;
        nrPojazdu=maxLiczbaPojazdow+1;
        maxLiczbaPojazdow++;
    }

    public String wyswietl4() {
        return "\nMarka: " + marka +
                "\nNazwa: " + nazwa +
                "\nPojemość silnika: " + pojemnoscSilnika +
                "\nRodzaj silnika: " + rodzsil +
                "\nMoc: " + moc +
                "\nMoment obrotowy: " + momentObrotowy +
                "\nVIN: " + VIN +
                "\nSegment: " + seg +
                "\nPojazd " + nrPojazdu +
                " z " + maxLiczbaPojazdow;

    }
}