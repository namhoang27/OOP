package BTt1;

public class Staff extends Officer{
    private String work;

    public Staff(String name, String gender, String address, int age, String work) {
        super(name, gender, address, age);
        this.work = work;
    }

    @Override
    public String toString(){
        return "Ky su {" + "Name: "+name+ "\""+ "Gender: "+gender+ "\""+ "Address: "+address+"\""+"Age: "
                +age+"\""+"Work : "+work;
    }
}
