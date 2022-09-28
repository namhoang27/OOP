package BT2;

public class NewSpaper extends Document {
    private int dayIssue;

    public int getDayIssue() {
        return dayIssue;
    }

    public void setDayIssue(int dayIssue) {
        this.dayIssue = dayIssue;
    }

    public NewSpaper(String id, String publisher, int numberPublish, int dayIssue) {
        super(id, publisher, numberPublish);
        this.dayIssue = dayIssue;
    }

    @Override
    public String toString(){
        return "NewSpaper { "+"dayIssue "+dayIssue+", id: "+id+" ,pulisher: "+publisher+" ,numberPublish: "+numberPublish;
    }
}
