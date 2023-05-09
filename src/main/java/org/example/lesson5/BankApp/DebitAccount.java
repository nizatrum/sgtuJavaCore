package org.example.lesson5.BankApp;

public class DebitAccount extends AbstractAccount {
    public DebitAccount(Client clientOwner, double rate, double balance) {
        this.id += counterId++;
        this.clientOwner = clientOwner;
        this.rate = rate;
        this.balance = balance;
    }

    @Override
    public boolean withDraw(double moneyAmount) {
        if (moneyAmount > 0 && balance - moneyAmount >= 0) {
            balance -= moneyAmount;
            return true;
        }
        return false;
    }

    @Override
    public void processPercentage() {
        if (balance > 10000) {
            balance += balance * rate / 100;
        }
    }
}
