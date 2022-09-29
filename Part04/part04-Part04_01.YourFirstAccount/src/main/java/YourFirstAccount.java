
public class YourFirstAccount {

    public static void main(String[] args) {
        // Do not touch the code in Account.java
        // Write your program here

        Account newAcc = new Account("Owner", 100.00);

        newAcc.deposit(20.0);

        System.out.println(newAcc);
    }
}
