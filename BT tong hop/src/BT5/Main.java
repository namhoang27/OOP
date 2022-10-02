package BT5;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] agrs){
        Scanner sc = new Scanner(System.in);
        Hotel hotel = new Hotel();
        while (true){
            System.out.println("Application manage Hotel!!!");
            System.out.println("Enter 1: To add new customer for rent");
            System.out.println("Enter 2: To remove customer by CCCD");
            System.out.println("Enter 3: To calculate price rent");
            System.out.println("Enter 4: To show information of customer");
            System.out.println("Enter 5: To exit");
            String line = sc.nextLine();
            switch (line){
                case "1":{
                    System.out.println("Enter Name of customer: ");
                    String name = sc.nextLine();
                    System.out.println("Enter age: ");
                    int age = Integer.parseInt(sc.nextLine());
                    System.out.println("Enter CCCD: ");
                    String cccd = sc.nextLine();
                    System.out.println("Enter a to choose RoomA ");
                    System.out.println("Enter b to choose RoomA ");
                    System.out.println("Enter c to choose RoomA ");
                    String choice = sc.nextLine();
                    Room room;
                    if(choice.equals("a")){
                         room = new RoomA();
                    }
                    else if(choice.equals("b")){
                         room = new RoomB();
                    }
                    else if(choice.equals("c")){
                         room = new RoomC();
                    }
                    else {
                        System.out.println("Invalid room! Choose again! ");
                        continue;
                    }
                    System.out.println("Enter the number of rent day: ");
                    int dateRent = Integer.parseInt(sc.nextLine());
                    Person person = new Person(name,cccd,age,room,dateRent);
                    hotel.addNewPerson(person);
                    break;
                }
                case "2":{
                    System.out.println("Enter CCCD: ");
                    String cccd = sc.nextLine();
                    if(hotel.deletePerson(cccd)){
                        System.out.println("Remove successfully!");
                    }
                    else System.out.println("Wrong CCCD!");
                    break;
                }
                case "3":{
                    System.out.println("Enter CCCD: ");
                    String cccd = sc.nextLine();
                    System.out.println("Total price of customer= "+hotel.calculate(cccd));
                    break;
                }
                case "4":{
                    System.out.println("Enter CCCD: ");
                    String cccd = sc.nextLine();
                    hotel.showInfor(cccd);
                    break;
                }
                case "5":{
                    return;
                }
            }
        }
    }
}
