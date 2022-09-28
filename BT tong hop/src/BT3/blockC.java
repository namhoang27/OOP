package BT3;

public class blockC extends Candidate{
    public static final String Mon_Van = "Van hoc";
    public static final String Mon_Su = "Lich Su";
    public static final String Mon_Dia = "Dia Ly";

    public blockC(String id, String name, String address, int priolity) {
        super(id, name, address, priolity);
    }

    @Override
    public String toString() {
        return "Hs khoi C { ID:" + id + " ,Name: " + name + " ,Dia chi: " + address + " ,Uu tien: " + priolity +
                "Subject: " + Mon_Van + "-" + Mon_Su + "-" + Mon_Dia + " }";
    }
}

