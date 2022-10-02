package BT6;

import java.util.ArrayList;
import java.util.List;

public class manageStudent {
    private List<Student> students;
    public manageStudent(){
        this.students = new ArrayList<>();
    }
    public void addStudent(Student student){
        this.students.add(student);
    }
    public void searchStudentByAge(int age){
        this.students.stream().filter(n->n.getAge()==age).forEach(o-> System.out.println(o.toString()));
    }

    public void countNumbStuByAge(int age, String hometown){
       long count = this.students.stream().filter(n->n.getHometown().equals(hometown)&&n.getAge()==age).count();
        System.out.println("So luong hoc sinh la: "+count);
    }
}

