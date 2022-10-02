package BT6;

public class Student {
    protected String name, hometown;
    protected int age;

    public Student(String name, String hometown, int age) {
        this.name = name;
        this.hometown = hometown;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHometown() {
        return hometown;
    }

    public void setHometown(String hometown) {
        this.hometown = hometown;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public String toString(){
        return "Student { Name: "+name+" - Age: "+age+" - Hometown: "+hometown+" }";
    }
}
