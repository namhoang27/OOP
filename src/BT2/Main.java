package BT2;

public class Main {
    public static void main(String[] args) {

        Rectangle rec1 = new Rectangle();
        display(rec1);
        Rectangle rec2 = new Rectangle(2,3);
        display(rec2);
        Rectangle rec3 = new Rectangle(6,7);
        display(rec3);
    }


    public static void display(Rectangle rectangle){
        System.out.println(rectangle.toString());
        System.out.println("Area = " +rectangle.getArea());
        System.out.println();
    }
}
