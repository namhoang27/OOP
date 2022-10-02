package BT5;

public class Room {
    protected String type;
    protected int price;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Room(String type, int price) {
        this.type = type;
        this.price = price;
    }
}
