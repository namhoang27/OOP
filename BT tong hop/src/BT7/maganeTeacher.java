package BT7;

import java.util.ArrayList;
import java.util.List;

public class maganeTeacher {
    private List<Teacher> teachers;
    public maganeTeacher(){
        this.teachers = new ArrayList<>();
    }
    public void addTeacher(Teacher teacher){
        this.teachers.add(teacher);
    }

    public boolean removeTeacher(String id){
        Teacher teacher = this.teachers.stream().filter(n->n.getId().equals(id)).findFirst().orElse(null);
        if(teachers==null){
            return false;
        }
         this.teachers.remove(teacher);
        return true;
    }
    public double getRealSalary(String id){
        Teacher teacher = this.teachers.stream().filter(n->n.getId().equals(id)).findFirst().orElse(null);
        if(teachers==null){
            return 0;
        }
        return teacher.getSalary()+teacher.getBonus()-teacher.getPenaty();

    }
}
