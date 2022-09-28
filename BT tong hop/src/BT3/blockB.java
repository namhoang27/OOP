package BT3;

public class blockB extends Candidate{
    public static final String Mon_Toan = "Toan hoc";
    public static final String Mon_Sinh = "Sinh hoc";
    public static final String Mon_Hoa = "Hoa hoc";

    public blockB(String id, String name, String address, int priolity) {
        super(id, name, address, priolity);
    }

    @Override
    public String toString() {
        return "Hs khoi B { ID:" + id + " ,Name: " + name + " ,Dia chi: " + address + " ,Uu tien: " + priolity +
                "Subject: " + Mon_Toan + "-" + Mon_Sinh + "-" + Mon_Hoa + " }";
    }
}
