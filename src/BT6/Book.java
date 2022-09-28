package BT6;

public class Book {
    private String name;
    private double price;
    private int count;
    private Author author;

    public Book(String name, double price, int count, Author author) {
        this.name = name;
        this.price = price;
        this.count = count;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public Author getAuthor() {
        return author;
    }
    public int count(){
        return count;
    }
    public String toString(){
        return "Book's name: "+this.name+" -Author: "+author.getName()+" -Price: "+this.price+ " -Count: "+this.count;
    }
}
