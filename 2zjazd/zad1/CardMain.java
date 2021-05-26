package src.zad1;


public class CardMain {
public static void main(String[] args) {
        Card cardOne = new Card(10, kolor.TREFL);
        System.out.println(cardOne.getWorth() + " " + cardOne.getCardColor());

        Card cardTwo = new Card(5, kolor.PIK);
        System.out.println(cardTwo.getWorth() + " " + cardTwo.getCardColor());

        Card cardThree = new Card(2, kolor.KIER);
        System.out.println(cardThree.getWorth() + " " + cardThree.getCardColor());
    }
}
