package BT5;

public class Main {
    public static void main(String[] args){
        Date date1 = new Date(28,2,1996);
        display(date1);
    }
    public static void display(Date date){
        if(date.isLeapYear()){
            System.out.println("Nam "+date.getYear()+" la nam nhuan");
        }
        else {
            System.out.println("Nam "+date.getYear()+" khong la nam nhuan");
        }
        if (date.validate()){
            System.out.println(date);
        }
        else{
            System.out.println("ngay thang chua hop le");
        }
    }
}
