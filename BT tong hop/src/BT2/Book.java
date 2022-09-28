package BT2;

public class Book extends Document {
    private String authorName;
    private int pageNumber;

    public Book(String id, String publisher, int numberPublish, String authorName, int pageNumber) {
        super(id, publisher, numberPublish);
        this.authorName = authorName;
        this.pageNumber = pageNumber;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }
    @Override
    public String toString(){
        return "Book { "+"Author: "+authorName+" ,page: "+pageNumber+" ,Id: "+id+" ,pulisher: "+publisher+" ,numberPublish: "+numberPublish;
    }
}
