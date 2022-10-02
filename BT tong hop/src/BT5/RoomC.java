package BT5;

public class RoomC extends Room{
    public RoomC() {
        super("C", 150);
    }
    @Override
    public String toString(){
        return "Room: "+type+ " - Price: "+price;
    }
}