package BT2;

public class Document {
    protected  String id, publisher;
    protected  int numberPublish;

    public Document(String id, String publisher, int numberPublish) {
        this.id = id;
        this.publisher = publisher;
        this.numberPublish = numberPublish;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getNumberPublish() {
        return numberPublish;
    }

    public void setNumberPublish(int numberPublish) {
        this.numberPublish = numberPublish;
    }
}
