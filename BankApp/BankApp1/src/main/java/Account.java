public interface Account {
    boolean replenish(double moneyAmount);

    boolean withdraw(double moneyAmount);

    void processPercentage();

    boolean transfer(Account forTransfer, double moneyAmount);

    Client getOwner();

    double getBalance();
}
