class Lokomotywa extends Maszyna {
    private final rodzajSilnika rodzsil;
    private double maxsila;
    private int liczbasilnikow;

    public Lokomotywa(String marka, String nazwa, double pojemnoscSilnika, double maxsila, int liczbasilnikow, rodzajSilnika rodzsil) {
        this.marka = marka;
        this.nazwa = nazwa;
        this.pojemnoscSilnika = pojemnoscSilnika;
        this.maxsila = maxsila;
        this.liczbasilnikow = liczbasilnikow;
        this.rodzsil = rodzsil;
    }

    public double getMaxsila() {
        return maxsila;
    }
    public int getLiczbasilnikow() {
        return liczbasilnikow;
    }
    public void setMaxsila(double maxsila) {
        this.maxsila = maxsila;
    }
    public void setLiczbasilnikow(int liczbasilnikow) {
        this.liczbasilnikow = liczbasilnikow;
    }

    public String wyswietl1(){
        return "Marka =\t" + marka  +
                "\nNazwa =\t" + nazwa +
                "\nPojemność silnika =\t" + pojemnoscSilnika + " MW" +
                "\nMaksymalna siła =\t" + maxsila + " kN" +
                "\nLiczba silników =\t" + liczbasilnikow +
                "\nRodzaj silnika =\t" + rodzsil;
    }

}

