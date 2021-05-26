package src.zad1;

public class Card {
    private int worth;
    private kolor cardcolor;

    public Card(int worth, kolor cardcolor) {
        this.worth = worth;
        this.cardcolor = cardcolor;
    }

    public int getWorth() {
        return worth;
    }

    public void setWorth(int worth) {
        this.worth = worth;
    }

    public kolor getCardColor() {
        return cardcolor;
    }

    public void setCardColor(kolor cardcolor) {
        this.cardcolor = cardcolor;
    }

}
