package org.example.lesson5.BankApp;

public class CreditAccount extends AbstractAccount {
    public CreditAccount(Client clientOwner, double rate, double balance) {
        this.id += counterId++;
        this.clientOwner = clientOwner;
        this.rate = rate;
        this.balance = balance;
    }
    private static final int limit = -100000;

    @Override
    public boolean withDraw(double moneyAmount) {
        if (moneyAmount > 0 && balance - moneyAmount >= limit) {
            balance -= moneyAmount;
            return true;
        }
        return false;
    }

    @Override
    public void processPercentage() {
        balance -= balance * rate / 100;
    }

}
