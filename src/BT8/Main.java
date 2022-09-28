package BT8;

public class Main {
    public static void main(String[] agrs){
        Staff staff = new Staff("Nv 1", "Cau Giay","Nhan Chinh", 500);
        System.out.println("Luong moi cua "+staff.getName()+" la: "+staff.upToSalary(10));
        Student student = new Student("Hoang", "Quan nhan", "Toan-Ly-Hoa", 18, 4);
        System.out.println(student.getRating());
    }
}
