package BT7;

public class Main {
    public static void main(String[] agrs){
        Address address = new Address("USA","LA","district 6", "Hoang Ngan");
        Student student = new Student("Naho",28,7.6,address);
        System.out.println(student.toString());
        System.out.println(student.getRating());
    }
}
