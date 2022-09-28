package BT2;

import BTt1.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] agrs) {
        Scanner sc = new Scanner(System.in);
        ManageDoc manageDoc = new ManageDoc();
        while (true) {
            System.out.println("Application Manage Document");
            System.out.println("Enter 1: To add document");
            System.out.println("Enter 2: To search document by catelogy");
            System.out.println("Enter 3: To display information of document");
            System.out.println("Enter 4: To remove document by id");
            System.out.println("Enter 5: To exit");
            String line = sc.nextLine();
            switch (line) {
                case "1": {
                    System.out.println("Enter a: To insert Book");
                    System.out.println("Enter b: To insert Newspaper");
                    System.out.println("Enter c: To insert Megazine");
                    String line1 = sc.nextLine();
                    if (line1.equals("a")) {
                            System.out.println("Enter ID: ");
                            String id = sc.nextLine();
                            System.out.println("Enter publisher: ");
                            String publisher = sc.nextLine();
                            System.out.println("Enter numberPublish: ");
                            int numberPublish = Integer.parseInt(sc.nextLine());
                            System.out.println("Enter authorName: ");
                            String authorName = sc.nextLine();
                            System.out.println("Enter pageNumber: ");
                            int pageNumber = Integer.parseInt(sc.nextLine());
                            Document book = new Book(id, publisher, numberPublish, authorName, pageNumber);
                            manageDoc.addDoc(book);
                            System.out.println(book.toString());
                            break;
                        }
                        else if (line1.equals("b")) {
                            System.out.println("Enter dayIssue: ");
                            int dayIssue = Integer.parseInt(sc.nextLine());
                            System.out.println("Enter ID: ");
                            String id = sc.nextLine();
                            System.out.println("Enter publisher: ");
                            String publisher = sc.nextLine();
                            System.out.println("Enter numberPublish: ");
                            int numberPublish = Integer.parseInt(sc.nextLine());
                            Document newspaper = new NewSpaper(id, publisher, numberPublish, dayIssue);
                            manageDoc.addDoc(newspaper);
                            System.out.println(newspaper);
                        break;
                        }
                    else if (line1.equals("c")) {
                            System.out.println("Enter issueNumber: ");
                            int issueNumber = Integer.parseInt(sc.nextLine());
                            System.out.println("Enter monthIssue: ");
                            int monthIssue = Integer.parseInt(sc.nextLine());
                            System.out.println("Enter ID: ");
                            String id = sc.nextLine();
                            System.out.println("Enter publisher: ");
                            String publisher = sc.nextLine();
                            System.out.println("Enter numberPublish: ");
                            int numberPublish = Integer.parseInt(sc.nextLine());
                            Document megazine = new Megazine(id, publisher, numberPublish, issueNumber, monthIssue);
                            manageDoc.addDoc(megazine);
                            System.out.println(megazine.toString());
                        break;
                        }
                       else{
                            System.out.println("Invalid");
                            break;
                    }
                }
                case "2": {
                    System.out.println("Enter a to search book: ");
                    System.out.println("Enter b to search newspaper: ");
                    System.out.println("Enter a to search megazine: ");
                    String choice = sc.nextLine();
                    if (choice.equals("a")) {
                            manageDoc.searchbyBook();
                            break;
                        }
                     else if (choice.equals("b")) {
                            manageDoc.searchbyNewspaper();
                            break;
                        }
                     else if (choice.equals("c")) {
                            manageDoc.searchbyMegazine();
                            break;
                        }
                    }
                case "3": {
                    manageDoc.showInfor();
                    break;
                }
                case "4": {
                    System.out.println("Enter ID to remove: ");
                    String remove = sc.nextLine();
                    manageDoc.deleteDocument(remove);
                }
                case "5": {
                    return;
                }
                default:
                    System.out.println("Invalid");
                    continue;
            }
        }
    }
}
