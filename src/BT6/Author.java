package BT6;

public class Author {
    private String name, email,gender;
    private int age;

    public Author(String name, String email, String gender, int age) {
        this.name = name;
        this.email = email;
        this.gender = gender;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getGender() {
        return gender;
    }
    public String toString(){
        return "Author: Name"+this.name+" -Email: "+this.email+" -gender: "+this.email;
    }
}
