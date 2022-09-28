package BT3;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] agrs) {
        Scanner sc = new Scanner(System.in);
        manageCandidate manageCandidate = new manageCandidate();
        while (true) {
            System.out.println("Application manage Candidate: ");
            System.out.println("Enter 1: To add new Candidate");
            System.out.println("Enter 2: To show all Candidates information");
            System.out.println("Enter 3: To search candidate by ID");
            System.out.println("Enter 4: To Exist");
            String candi = sc.nextLine();
            switch (candi) {
                case "1": {
                    System.out.println("Enter a : To add Candidate of Block A");
                    System.out.println("Enter b : To add Candidate of Block B");
                    System.out.println("Enter c : To add Candidate of Block C");
                    String block = sc.nextLine();
                    if (block.equals("a")) {
                        System.out.println("Enter ID:");
                        String id = sc.nextLine();
                        System.out.println("Enter Name: ");
                        String name = sc.nextLine();
                        System.out.println("Enter address: ");
                        String address = sc.nextLine();
                        System.out.println("Enter priority: ");
                        int priority = Integer.parseInt(sc.nextLine());
                        Candidate blockA = new blockA(id, name, address, priority);
                        manageCandidate.addCandidate(blockA);
                        System.out.println(blockA);
                        break;
                    } else if (block.equals("b")) {
                        System.out.println("Enter ID:");
                        String id = sc.nextLine();
                        System.out.println("Enter Name: ");
                        String name = sc.nextLine();
                        System.out.println("Enter address: ");
                        String address = sc.nextLine();
                        System.out.println("Enter priority: ");
                        int priority = Integer.parseInt(sc.nextLine());
                        Candidate blockB = new blockA(id, name, address, priority);
                        manageCandidate.addCandidate(blockB);
                        System.out.println(blockB);
                        break;
                    } else if (block.equals("c")) {
                        System.out.println("Enter ID:");
                        String id = sc.nextLine();
                        System.out.println("Enter Name: ");
                        String name = sc.nextLine();
                        System.out.println("Enter address: ");
                        String address = sc.nextLine();
                        System.out.println("Enter priority: ");
                        int priority = Integer.parseInt(sc.nextLine());
                        Candidate blockC = new blockA(id, name, address, priority);
                        manageCandidate.addCandidate(blockC);
                        System.out.println(blockC);
                        break;
                    } else {
                        System.out.println("Invalid");
                        break;
                    }
                }
                case "2": {
                    manageCandidate.showCandidateInfor();
                    break;
                }
                case "3": {
                    System.out.println("Enter the ID of candidate you want to search: ");
                    String id = sc.nextLine();
                    manageCandidate.searchCandidate(id);
                    break;
                }
                case "4":{
                    return;
                }
                default:
                    System.out.println("Invalid");
                    continue;
            }
        }
    }
}
