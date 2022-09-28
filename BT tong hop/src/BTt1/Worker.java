package BTt1;

public class Worker extends Officer{
    private int level;

    public Worker(String name, String gender, String address, int age, int level) {
        super(name, gender, address, age);
        this.level = level;
    }
    @Override
    public String toString(){
        return "Cong Nhan {" + "Name: "+name+ "\""+ "Gender: "+gender+ "\""+ "Address: "+address+"\""+"Age: "
                +age+"\""+"Level: "+level;
    }
}
