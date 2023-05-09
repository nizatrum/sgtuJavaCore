package org.example.lesson5.BankApp;

public interface Account {
    boolean replenish(double moneyAmount);
    boolean withDraw(double moneyAmount);
    boolean transfer(Account forTransfer, double moneyAmount);
    void processPercentage();

    double getBalance();
    Client getOwner();

}
