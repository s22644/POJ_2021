package src.zad4;


public class ClockMain {
    public static void main(String[] args) {
        Clock day = new Clock(12, 0, 0);
        System.out.printf("%02d:%02d:%02d%n",day.getHours(), day.getMinutes(), day.getSeconds());
        System.out.printf("TickDown = %02d:%02d:%02d%n", day.getHours(), day.getMinutes(), day.tickDown());
        Clock today = new Clock(3, 12, 58);
        System.out.printf("%02d:%02d:%02d%n", today.getHours(), today.getMinutes(), today.getSeconds());

        System.out.printf("Tick = %02d:%02d:%02d%n", today.getHours(), today.getMinutes(), today.tick());
        System.out.printf("TickDown = %02d:%02d:%02d%n", today.getHours(), today.getMinutes(), today.tickDown());
        System.out.printf("ToString = %02d:%02d:%02d%n", today.getHours(), today.getMinutes(), today.ToString());

    }
}
