public class Date {
    private int day;
    private int month;
    private int yaer;

    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYaer(int yaer) {
        this.yaer = yaer;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYaer() {
        return yaer;
    }

    public Date(int day,int month , int year ){
        this.day = day;
        this.month = month;
        this.yaer = year;
    }

public String toString(){
        return String.format("%d/%d/%d",day,month,yaer);
}

}
