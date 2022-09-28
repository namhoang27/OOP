package BT3;

public class Employee {
    private int id;
    private int salary;

    public int getId() {
        return id;
    }

    public int getPercent() {
        return percent;
    }

    private int percent;
    private String firstName, lastName;

    public Employee(int id, int salary, String firstName, String lastName, int percent) {
        this.id = id;
        this.salary = salary;
        this.firstName = firstName;
        this.lastName = lastName;
        this.percent = percent;
    }
    public Employee(){}


    public int getSalary() {
        return salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    public String getFullName(){
        return this.lastName + " " +this.firstName;
    }
    public int getAnnualSalary(){
        return salary*12;
    }
    public int upToSalary(){
        return salary + (salary*percent)/100;
    }
    public String toString(){
        return "FullName "+getFullName()+ " -AnnualSalary: "+getAnnualSalary();
    }
}
