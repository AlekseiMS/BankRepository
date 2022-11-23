public class DebitAccount extends AbstractAccount {

    public DebitAccount(int id, int rate, Client owner, double balance) {
        this.owner = owner;
        this.balance = balance;
        this.id = id;
        this.rate = rate;
    }

    public boolean withdraw(double moneyAmount) {
        if (moneyAmount > 0 && balance >= moneyAmount) {
            balance -= moneyAmount;
            return true;
        }
        return false;
    }

    @Override
    public boolean transfer(Account forTransfer, double moneyAmount) {
        if (moneyAmount > 0 && balance - moneyAmount >= 0) {
            withdraw(moneyAmount);
            forTransfer.replenish(moneyAmount);
            return true;
        }
        return false;
    }

    @Override
    public void processPercentage() {
        replenish(balance * rate / 100);
    }
}

// 100
//