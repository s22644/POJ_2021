class Kosiarka extends Maszyna {
    private boolean czyMelekser;
    private boolean czyNaped;
    private int liczbaOstrzy;
    private final rodzajSilnika rodzsil;

    public Kosiarka(boolean czyMelekser, boolean czyNaped, int liczbaOstrzy, String marka, String nazwa, double pojemnoscSilnika, rodzajSilnika rodzsil) {
        this.czyMelekser = czyMelekser;
        this.czyNaped = czyNaped;
        this.liczbaOstrzy = liczbaOstrzy;
        super.marka = marka;
        super.nazwa = nazwa;
        super.pojemnoscSilnika = pojemnoscSilnika;
        this.rodzsil = rodzsil;
    }

    public boolean isCzyMelekser() {
        return czyMelekser;
    }
    public void setCzyMelekser(boolean czyMelekser) {
        this.czyMelekser = czyMelekser;
    }

    public boolean isCzyNaped() {
        return czyNaped;
    }
    public void setCzyNaped(boolean czyNaped) {
        this.czyNaped = czyNaped;
    }

    public void setLiczbaOstrzy(int liczbaOstrzy) {
        this.liczbaOstrzy = liczbaOstrzy;
    }

    public String wyswietl2() {
        return "Kosiarka: " +
                " \nczyMelekser = " + czyMelekser +
                ", \nczyNaped = " + czyNaped +
                ", \nliczbaOstrzy = " + liczbaOstrzy +
                ", \nmarka = " + marka +
                ", \nnazwa = " + nazwa +
                ", \npojemoscSilnika = " + pojemnoscSilnika +
                ", \nrodzajSilnika = " + rodzsil;
    }
}