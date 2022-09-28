package BT2;

import java.util.ArrayList;
import java.util.List;

public class ManageDoc {
    private List<Document> documents;

    public ManageDoc() {
        this.documents = new ArrayList<>();
    }

    public void addDoc(Document document) {
        this.documents.add(document);
    }

    public boolean deleteDocument(String id) {
        Document doc = this.documents.stream()
                .filter(document -> document.getId().equals(id))
                .findFirst().orElse(null);
        if (doc == null) {
            return false;
        }
        this.documents.remove(doc);
        return true;
    }

    public void showInfor() {
        this.documents.forEach(document -> System.out.println(document.toString()));
    }

    public void searchbyBook() {
        this.documents.stream().filter(doc -> doc instanceof Book).forEach(document -> System.out.println(document.toString()));
    }

    public void searchbyMegazine() {
        this.documents.stream().filter(doc -> doc instanceof Megazine).forEach(document -> System.out.println(document.toString()));
    }
    public void searchbyNewspaper() {
        this.documents.stream().filter(doc -> doc instanceof NewSpaper).forEach(document -> System.out.println(document.toString()));
    }
}
