public abstract class AbstractAccount implements Account {
    protected int id;
    protected double balance;
    protected int rate;
    protected Client owner;

    public boolean replenish(double moneyAmount) {
        if (moneyAmount > 0) {
            balance += moneyAmount;
            return true;
        }
        return false;
    }

    public abstract boolean withdraw(double moneyAmount);

    public abstract boolean transfer(Account forTransfer, double moneyAmount);

    public Client getOwner() {
        return owner;
    }

    public int getId() {
        return id;
    }

    @Override
    public double getBalance() {
        return balance;
    }

    public int getRate() {
        return rate;
    }

    @Override
    public String toString() {
        return "AbstractAccount{" +
                "id=" + id +
                ", balance=" + balance +
                ", rate=" + rate +
                ", owner=" + owner +
                '}';
    }
}
