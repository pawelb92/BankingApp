package org.example;

public class Account {
    private String name;
    private String lastName;
    private String pesel;
    private String login;
    private String accountNumber;
    private double balance;
    private int pin;

    Account(String name, String lastName, String pesel, String login, String accountNumber, double balance, int pin) {
        this.name = name;
        this.lastName = lastName;
        this.pesel = pesel;
        this.login = login;
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.pin = pin;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPesel() {
        return pesel;
    }

    public String getLogin() {
        return login;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public int getPin() {
        return pin;
    }

    public double withdraw(double moneyToWithdraw) {
        return balance = balance - moneyToWithdraw;
    }
    public double deposit(double moneyToDeposit){
        return balance = balance + moneyToDeposit;
    }
    public double credit(double moneyToBorrow){
        double check = balance * 0.1;
        if (check > moneyToBorrow){
            return balance += moneyToBorrow;
        } else {
            System.out.println("Kredyt nie dostepny");
            return balance;
        }

    }

}
