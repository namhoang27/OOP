package BT5;

import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private List<Person> persons;
    public Hotel(){
        this.persons = new ArrayList<>();
    }
    public void addNewPerson(Person person){
        this.persons.add(person);
    }

    public boolean deletePerson(String cccd){
        Person person = this.persons.stream().filter(n->n.getCccd().equals(cccd)).findFirst().orElse(null);
        if(person==null){
            return false;
        }
        else this.persons.remove(person);
        return true;
    }
    public int calculate(String cccd){
        Person person = this.persons.stream().filter(n->n.getCccd().equals(cccd)).findFirst().orElse(null);
        if(person==null){
            return 0;
        }
        return person.getRoom().price*person.getDateRent();
    }
    public void showInfor(String cccd){
        this.persons.stream().filter(n->n.getCccd().equals(cccd)).forEach(person -> System.out.println(person.toString()));
    }

}
