package BTt1;

public class Enigineer extends Officer{
    private String branch;

    public Enigineer(String name, String gender, String address, int age, String branch) {
        super(name, gender, address, age);
        this.branch = branch;
    }
    @Override
    public String toString(){
        return "Ky su {Name: "+name+ "\'"+ "Gender: "+gender+ "\'"+ "Address: "+address+"\'"+"Age: "
                +age+"\'"+"Branch: "+branch+ " }";
    }
}
