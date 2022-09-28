package BTt1;

import java.util.Scanner;

public class Main {
    public static void main(String[] agrs) {
        Scanner sc = new Scanner(System.in);
        ManageOfficer manageOfficer = new ManageOfficer();
        while (true) {
            System.out.println("Application Manage Officer");
            System.out.println("Enter 1: To insert officer");
            System.out.println("Enter 2: To search officer by name");
            System.out.println("Enter 3: To display information of officer");
            System.out.println("Enter 4: To exit");
            String line = sc.nextLine();
            switch (line) {
                case "1": {
                    System.out.println("Enter a: To insert Engineer");
                    System.out.println("Enter b: To insert Staff");
                    System.out.println("Enter c: To insert Worker");
                    String line1 = sc.nextLine();
                    switch (line1) {
                        case "a": {
                            System.out.println("Enter Name: ");
                            String name = sc.nextLine();
                            System.out.println("Enter Age: ");
                            int age = sc.nextInt();
                            System.out.println("Enter Gender: ");
                            String gender = sc.nextLine();
                            System.out.println("Enter Address: ");
                            String address = sc.nextLine();
                            System.out.println("Enter Branch: ");
                            String branch = sc.nextLine();
                            Officer engineer = new Enigineer(name, gender, address, age, branch);
                            manageOfficer.addOfficer(engineer);
                            System.out.println(engineer.toString());
                            continue;
                        }
                        case "b": {
                            System.out.println("Enter Name: ");
                            String name = sc.nextLine();
                            System.out.println("Enter Age: ");
                            int age = sc.nextInt();
                            System.out.println("Enter Gender: ");
                            String gender = sc.nextLine();
                            System.out.println("Enter Address: ");
                            String address = sc.nextLine();
                            System.out.println("Enter Work: ");
                            String work = sc.nextLine();
                            Officer staff = new Staff(name, gender, address, age, work);
                            manageOfficer.addOfficer(staff);
                            System.out.println(staff.toString());
                            continue;
                        }
                        case "c": {
                            System.out.println("Enter Name: ");
                            String name = sc.nextLine();
                            System.out.println("Enter Age: ");
                            int age = sc.nextInt();
                            System.out.println("Enter Gender: ");
                            String gender = sc.nextLine();
                            System.out.println("Enter Address: ");
                            String address = sc.nextLine();
                            System.out.println("Enter Level: ");
                            int level = sc.nextInt();
                            Officer work = new Worker(name, gender, address, age, level);
                            manageOfficer.addOfficer(work);
                            System.out.println(work.toString());
                            continue;
                        }
                        default:
                            System.out.println("Invalid");
                            continue;
                    }
                }
                case "2": {
                    System.out.println("Enter name to search: ");
                    String name = sc.nextLine();
                    manageOfficer.searchOfficerByName(name).forEach(officer -> {
                        System.out.println(officer.toString());
                    });
                    break;
                }
                case "3": {
                    manageOfficer.showListInforOfficer();
                    break;
                }
                case "4": {
                    return;
                }
                default:
                    System.out.println("Invalid");
                    continue;
            }
        }
    }
}
