public class PaymentCard {

    private double balance;

    public PaymentCard(double openingBalance) {
        this.balance = openingBalance;
    }

    public String toString() {
        return "The card has a balance of " + this.balance + " euros";
    }

    public void eatAffordably() {
        double temp = this.balance;
        this.balance -= 2.60;

        if (this.balance < 0)
            this.balance = temp;

    }

    public void eatHeartily() {
        double temp = this.balance;
        this.balance -= 4.60;

        if (this.balance < 0)
            this.balance = temp;

    }

    public void addMoney(double amount) {
        if (amount > 0)
            this.balance += amount;

        if(this.balance > 150)
        this.balance = 150.0;    


    }

}
