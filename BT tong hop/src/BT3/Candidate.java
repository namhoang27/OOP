package BT3;

public class Candidate {
    protected  String id,name,address;
    protected  int priolity;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPriolity() {
        return priolity;
    }

    public void setPriolity(int priolity) {
        this.priolity = priolity;
    }

    public Candidate(String id, String name, String address, int priolity) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.priolity = priolity;
    }
}
