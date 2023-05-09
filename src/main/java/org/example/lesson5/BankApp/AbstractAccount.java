package org.example.lesson5.BankApp;

public abstract class AbstractAccount implements Account {
    protected static int counterId = 1;
    protected int id;
    protected double balance;
    protected double rate;
    protected Client clientOwner;
    public boolean replenish(double moneyAmount) {
        if (moneyAmount > 0) {
            balance += moneyAmount;
            return true;
        }
        return false;
    }
    public double getBalance() {
        return balance;
    }
    public abstract boolean withDraw(double moneyAmount);
    public boolean transfer(Account forTransfer, double moneyAmount) {
        if (moneyAmount > 0 && balance - moneyAmount >= 0) {
            withDraw(moneyAmount);
            forTransfer.replenish(moneyAmount);
            return true;
        }
        return false;
    }
    public Client getOwner() {
        return clientOwner;
    }

    @Override
    public String toString() {
        return "AbstractAccount{" +
                "id=" + id +
                ", balance=" + balance +
                ", rate=" + rate +
                ", clientOwner=" + clientOwner +
                '}';
    }
}
