package BT2;

public class Megazine extends Document {
    private int issueNumber, monthIssue;

    public int getIssueNumber() {
        return issueNumber;
    }

    public void setIssueNumber(int issueNumber) {
        this.issueNumber = issueNumber;
    }

    public int getMonthIssue() {
        return monthIssue;
    }

    public void setMonthIssue(int monthIssue) {
        this.monthIssue = monthIssue;
    }

    public Megazine(String id, String publisher, int numberPublish, int issueNumber, int monthIssue) {
        super(id, publisher, numberPublish);
        this.issueNumber = issueNumber;
        this.monthIssue = monthIssue;
    }
    @Override
    public String toString(){
        return "Megazine { "+"issueNumber "+issueNumber+", monthIssue: "+monthIssue+" ,Id: "+id+" ,pulisher: "+publisher+" ,numberPublish: "+numberPublish;
    }
}
