package BT3;

import BT2.Rectangle;

public class Main {
    public static void main(String[] args) {
        Employee Emp1 = new Employee(1,300,"Hoang","Nguyen", 10);
        display(Emp1);

    }


    public static void display(Employee employee){
        System.out.println(employee.toString());
        System.out.println("upToSalary = " +employee.upToSalary());
        System.out.println();
    }
}
