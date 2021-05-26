package src.zad5;

public class Numbers {
    int a, b, c;

    public void seta(int a) {
        this.a = a;

    }public void setb(int b) {
        this.b = b;

    }public void setc(int c) {
        this.c = c;

    }public int geta() {
        return a;

    }public int getb() {
        return b;

    }public int getc() {
        return c;
    }

    public int sum(){
        return geta()+getb()+getc();
    }
    public float average(){
        float suma = geta()+getb()+getc();
        return  (suma/3);
    }
    public int min(){
        if(geta() < getb() && geta() < getc())
            return geta();
        else if(getc() < geta() && getc() < getb())
            return getc();
        else
            return getb();
    }
    public double geometric(){
        double x = getb()*getb()*getc();
        return Math.pow((double) x,(double)1/3);
    }

}
