package src.zad4;

public class Clock {
    private int hours;
    private int minutes;
    private int seconds;

    public Clock(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        if (Checkhours(hours))
            this.hours = hours;
    }

    public int getMinutes() {
        return minutes;
    }


    public void setMinutes(int minutes) {
        if (Checkminutes(minutes))
            this.minutes = minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        if (Checkseconds(seconds))
            this.seconds = seconds;
    }

    private boolean Checkhours(int hours) {
        return (0 <= hours) && (hours <= 23);
    }

    private boolean Checkminutes(int minutes) {
        return (0 <= minutes) && (minutes <= 59);
    }

    private boolean Checkseconds(int seconds) {
        return (0 <= seconds) && (seconds <= 59);
    }

    public int tick() { //01 02 03
        return getSeconds() + 1;
    }

    public int tickDown() {
        return getSeconds() - 1;
    }

    public int ToString() { //[hh-mm-ss]
        return getSeconds();
    }
}

