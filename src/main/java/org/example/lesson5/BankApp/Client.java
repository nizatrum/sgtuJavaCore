package org.example.lesson5.BankApp;

public class Client {
    private static int counterId = 1;
    private int id;
    private String name;
    private String password;

    public Client(String name, String password) {
        this.id += counterId++;
        this.name = name;
        this.password = password;
    }
    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
