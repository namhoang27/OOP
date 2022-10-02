package BT6;

import java.util.Scanner;

public class Main {
    public static void main(String[] agrs){
        manageStudent manageStudent = new manageStudent();
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("Application manage Student: ");
            System.out.println("Enter 1: To add new Student");
            System.out.println("Enter 2: To search student by age");
            System.out.println("Enter 3: To search student by age and country");
            System.out.println("Enter 4: To Exist");
            String stu = sc.nextLine();
            switch (stu) {
                case "1":{
                    System.out.println("Enter Student name: ");
                    String name = sc.nextLine();
                    System.out.println("Enter Student age: ");
                    int age = Integer.parseInt(sc.nextLine());
                    System.out.println("Enter Student hometown: ");
                    String homwtown = sc.nextLine();
                    Student student = new Student(name,homwtown,age);
                    manageStudent.addStudent(student);
                    System.out.println(student.toString());
                    break;
                }
                case "2":{
                    System.out.println("Enter age what to search: ");
                    int age = Integer.parseInt(sc.nextLine());
                    manageStudent.searchStudentByAge(age);
                    break;
                }
                case "3":{
                    System.out.println("Enter age what to search: ");
                    int age = Integer.parseInt(sc.nextLine());
                    System.out.println("Enter Student hometown: ");
                    String homwtown = sc.nextLine();
                    manageStudent.countNumbStuByAge(age,homwtown);
                    break;
                }
                case "4":{
                    return;
                }
            }
        }
    }
}
