package BT2;

public class Rectangle {
    private int width;
    private  int length;


    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public Rectangle(int width, int length) {
        this.width = width;
        this.length = length;
    }
    public Rectangle() {
    }
    public double getArea(){
        return this.width*this.length;
    }

    public String toString(){
        return "Width = "+this.width+ " - Length: "+this.length;
    }
}
