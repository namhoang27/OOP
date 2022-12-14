package BTt1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ManageOfficer {
    private List<Officer> officers;

    public ManageOfficer() {
        this.officers = new ArrayList<>();
    }
    public void addOfficer(Officer officer){
        this.officers.add(officer);
    }

    public List<Officer> searchOfficerByName(String name){
        return this.officers.stream().filter(n->n.getName().contains(name)).collect(Collectors.toList());
    }

    public void showListInforOfficer(){
        this.officers.forEach(o -> System.out.println(o.toString()));
    }
}
