package BT5;

public class Person {
    private String name,cccd;
    private int age;
    private Room room;
    private int dateRent;

    public Person(String name, String cccd, int age, Room room, int dateRent) {
        this.name = name;
        this.cccd = cccd;
        this.age = age;
        this.room = room;
        this.dateRent = dateRent;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name= " + name + '\'' +
                ", age= " + age +
                ", CCCD=" + cccd + '\'' + room.toString() +
                ", dateRent= " +dateRent+
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCccd() {
        return cccd;
    }

    public void setCccd(String cccd) {
        this.cccd = cccd;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public int getDateRent() {
        return dateRent;
    }

    public void setDateRent(int dateRent) {
        this.dateRent = dateRent;
    }
}
