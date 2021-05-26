package src.zad3;

public class MyDate {
    private int day;
    private int month;
    private int year;

    public MyDate(int day,int month , int year) {
        this.setDay(day);
        this.setMonth(month);
        this.setYear(year);
    }
    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        if(Checkday(day))
            this.day = day;
    }
    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if(Checkmonth(month))
            this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if(Checkyear(year))
            this.year = year;
    }
    private boolean Checkday(int day) {
        return(0 <= day) && (day <= 31);
    }
    private boolean Checkmonth(int month){
    return(0 <= month) && (month <= 12);
    }
    private boolean Checkyear(int year){
        return(1990 <= year) && (year <= 2050);
    }

}


