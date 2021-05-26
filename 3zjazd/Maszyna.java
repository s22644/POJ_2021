
public abstract class Maszyna {

    protected String marka;
    protected String nazwa;
    protected double pojemnoscSilnika;
    enum rodzajSilnika {
        BENZYNA,
        DIESEL,
        ELEKTRYCZNY,
        NIE_DOTYCZY
    }
}