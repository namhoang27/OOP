package BT3;

public class blockA extends Candidate {
    public static final String Mon_Toan = "Toan Hoc";
    public static final String Mon_Ly = "Vat Ly";
    public static final String Mon_Hoa = "Hoa Hoc";

    public blockA(String id, String name, String address, int priolity) {
        super(id, name, address, priolity);
    }

    @Override
    public String toString() {
        return "Hs khoi A { ID:" + id + " ,Name: " + name + " ,Dia chi: " + address + " ,Uu tien: " + priolity +
                "Subject: "+Mon_Toan+"-"+Mon_Ly+"-"+Mon_Hoa+" }";
    }
}
