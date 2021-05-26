package src.zad3;

public class MyDateMain {
    public static void main(String[] args) {

        MyDate today = new MyDate(3, 5, 2009);
        today.setDay(today.getDay());
        System.out.println(today.getDay() + "/" + today.getMonth() + "/" + today.getYear());
        MyDate tomorrow = new MyDate(32, 8, 2077);
        System.out.println(tomorrow.getDay() + "/" + tomorrow.getMonth() + "/" + tomorrow.getYear());

    }
}
