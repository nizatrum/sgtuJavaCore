package org.example.lesson5.BankApp;

public class Main {
    public static void main(String[] args) {
        Client client1 = new Client("admin1", "root");
        Client client2 = new Client("admin2", "root");


        DebitAccount dbAcc1 = new DebitAccount(client1, 3, 5000);
        CreditAccount crAcc1 = new CreditAccount(client1, 17, 60000);

        DebitAccount dbAcc2 = new DebitAccount(client2, 3, 5000);
        CreditAccount crAcc2 = new CreditAccount(client2, 19, 60000);

        System.out.println(crAcc1);
        crAcc1.processPercentage();
        System.out.println(crAcc1);







    }
}
