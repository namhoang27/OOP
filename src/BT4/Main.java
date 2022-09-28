package BT4;



public class Main {

        public static void main(String[] args) {
            Account account1 = new Account("1","Hoang Nam1", 300);
            Account account2 = new Account("'2","Hanh", 500);
            Account.tranferTo(account1,account2,5000);
        }

}
