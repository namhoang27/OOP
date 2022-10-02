package BT7;


import BT6.Student;

import java.util.Scanner;

public class Main {
    public static void main(String[] agrs) {
        maganeTeacher maganeTeacher = new maganeTeacher();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Application manage Teacher: ");
            System.out.println("Enter 1: To add new Teacher");
            System.out.println("Enter 2: To remove Teacher by ID");
            System.out.println("Enter 3: To calculate Teacher's salary by ID");
            System.out.println("Enter 4: To Exist");
            String tea = sc.nextLine();
            switch (tea) {
                case "1": {
                    System.out.println("Enter Teacher name: ");
                    String name = sc.nextLine();
                    System.out.println("Enter Teacher age: ");
                    int age = Integer.parseInt(sc.nextLine());
                    System.out.println("Enter Teacher hometown: ");
                    String homwtown = sc.nextLine();
                    System.out.println("Enter Teacher's ID");
                    String id = sc.nextLine();
                    System.out.println("Enter Teacher's salary");
                    Double salary = Double.parseDouble(sc.nextLine());
                    System.out.println("Enter Teacher's bonus");
                    Double bonus = Double.parseDouble(sc.nextLine());
                    System.out.println("Enter Teacher's penaty");
                    Double penaty = Double.parseDouble(sc.nextLine());
                    Teacher teacher = new Teacher(name, homwtown, id, age, salary, bonus, penaty);
                    maganeTeacher.addTeacher(teacher);
                    System.out.println(teacher.toString());
                    break;
                }
                case "2": {
                    System.out.println("Enter ID teacher to remove: ");
                    String id = sc.nextLine();
                    maganeTeacher.removeTeacher(id);
                    break;
                }
                case "3": {
                    System.out.println("Enter ID teacher to calculate salary: ");
                    String id = sc.nextLine();
                    Double realSalary = maganeTeacher.getRealSalary(id);
                    System.out.println(realSalary);
                    break;
                }
                case "4":{
                    return;
                }
            }
        }
    }
}