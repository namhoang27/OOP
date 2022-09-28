package BT5;

public class Date {
    private int day, month, year;

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean isLeapYear() {
        if (this.year % 400 == 0) {
            return true;
        }
        return this.year % 4 == 0 && this.year % 100 != 0;
    }

    public String toString() {
        return "Date: {Day=" + this.day + " , month=" + this.month + " , year=" + this.year + "}";
    }

    public boolean validate(){
        if (this.month>=1 && this.month<=12){
            if(this.month == 4 || this.month == 6|| this.month == 9||this.month == 11){
                if(this.day == 30){
                    return true;
                }
            }
            if(this.month == 1 || this.month == 3|| this.month == 5||this.month == 7||this.month == 8||this.month == 10||this.month == 12){
                if(this.day == 31){
                    return true;
                }
            }
            if(this.month == 2 && isLeapYear()){
                if(this.day == 29 || this.day ==28){
                    return true;
                }
            }
            if(this.month == 2 && !isLeapYear()){
                return this.day == 28;
            }
        }
        return false;
    }
}
