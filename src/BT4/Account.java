package BT4;

public class Account {
    private String id,name;
    private int balance;

    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }
    public void  creat(int amount) {
        if (amount > 0) {
             this.balance += amount;

        }
    }
    public void debit(int amount){
        if(amount < this.balance){
            this.balance -= amount;

        }
        else {
            System.out.println("Thanh toan ko thanh cong");
        }
    }

    public static void tranferTo(Account account1, Account account2, int amount){
        if(amount>account1.balance){
            System.out.println("Chuyen tien ko thanh cong");
        }
        else{
            account1.balance-=amount;
            account1.debit(amount);
            System.out.println("Tai khoan "+account1.name+" vua thanh toan khoan tien: "+amount);
            account2.creat(amount);
            System.out.println("Tai khoan "+account2.name+" vua nhan khoan tien: "+amount);
        }
    }
}
