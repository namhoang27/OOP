package BT7;

import java.sql.SQLOutput;

public class Student {
    private String name;
    private int age;
    private double score;
    private Address address;

    public Student(String name, int age, double score, Address address) {
        this.name = name;
        this.age = age;
        this.score = score;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
    public String toString(){
        return "Student: { Name:"+this.name+" Age: "+this.age+" Score: "+this.score+" Address: "+this.address;
    }
    public String getRating(){
        if(score>=8){
           return "Grade: Good";
        }
        if(score>=5){
            return "Grade: Medium";
        }
        if(score<5){
            return "Grade: Bad";
        }
        return "WRONG score!!!";
    }
}
