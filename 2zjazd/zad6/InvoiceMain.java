package src.zad6;


public class InvoiceMain {
    public static void main(String[] args) {
        Invoice cola = new Invoice("123", "Cola", 8, 6.00);
        Invoice soda = new Invoice("277", "Soda", 500, 2.99);
        Invoice resztki = new Invoice();

        System.out.print(cola.getProduct_description() + " o nr " + cola.getProduct_number() + " Ilość: " + cola.getQuantity() + " Cena: " + cola.getPricePerItem() + "\n");
        System.out.println("Całkowita wartość towarów: " + cola.amount());
        System.out.println("------------------------------------------");
        System.out.print(soda.getProduct_description() + " o nr " + soda.getProduct_number() + " Ilość: " + soda.getQuantity() + " Cena: " + soda.getPricePerItem() + "\n");
        System.out.println("Całkowita wartość towarów: " + soda.amount());
        System.out.println("------------------------------------------");
        System.out.print(resztki.getProduct_description() + " o nr " + resztki.getProduct_number() + " Ilość: " + resztki.getQuantity() +  " Cena: " + resztki.getPricePerItem() + "\n");
        System.out.println("Całkowita wartość towarów: " + resztki.amount());
        System.out.println("------------------------------------------");
    }
}

