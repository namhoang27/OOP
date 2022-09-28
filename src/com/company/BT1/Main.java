package com.company.BT1;

public class Main {

    public static void main(String[] args) {
	Circle circle1 = new Circle();
	display(circle1);
	Circle circle2 = new Circle(2.0);
	display(circle2);
	Circle circle3 = new Circle(3.0, "blue");
	display(circle3);
    }
    public static void display(Circle circle){
        System.out.println(circle.toString());
        System.out.println("Area = " +circle.getArea());
        System.out.println();
    }
}
