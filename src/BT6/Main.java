package BT6;

public class Main {
    public static void main(String[] args){
        Author author1 = new Author("Joe adachi", "Ada@gmail.com","Male", 54);
        Book book1 = new Book("On the way", 34.5, 40000, author1);
        //System.out.println(author1.toString());
        System.out.println(book1.toString());
    }
}
