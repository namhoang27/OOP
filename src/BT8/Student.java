package BT8;

public class Student extends Person{
    private String program;
    private int age;
    private double score;

    public Student(String name, String address, String program, int age, double score) {
        super(name, address);
        this.program = program;
        this.age = age;
        this.score = score;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
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
