package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Account account1= new Account("Janusz","Januszewski","234144424424","adad","1234567890",10000,1234);
        Scanner sc= new Scanner(System.in);

        System.out.println("Witaj w naszym banku");
        System.out.println("Użtkowniku wpisz login");
        String login = sc.next();
        if (login.equals(account1.getLogin())){
            System.out.println("Poprawny login");
        } else {
            System.out.println("Niepoprawny Login");
        }
        System.out.println("Podaj kod pin");
        int pin=sc.nextInt();
        if (pin == account1.getPin());


        int wybor;
        do {
            System.out.println("MENU - Wybierz opcje.");
            System.out.println("\n 1 - Wpłata \n 2 - Wypłata \n 3 - Sprawdzenie salda konta \n 4 - Kredyt \n 5 - Wyloguj ");
            System.out.println(" Twój wybór");
            wybor = sc.nextInt();

            switch (wybor) {
                case 1:
                    System.out.println("Wpłata gotówki");
                    double wplata = sc.nextDouble();
                    account1.deposit(wplata);
                    System.out.println("Aktualny stan konta to :" + account1.getBalance());
                    break;
                case 2:
                    System.out.println("Wypłata gotówki");
                    double wyplata = sc.nextDouble();
                    account1.withdraw(wyplata);
                    System.out.println("Aktualny stan konta to :" + account1.getBalance());
                    break;
                case 3:
                    System.out.println("Saldo");
                    account1.getBalance();
                    System.out.println(account1.getBalance());
                    break;
                case 4:
                    System.out.println("Kredyt");
                    double kredyt = sc.nextDouble();
                    account1.credit(kredyt);
                    System.out.println("Aktualny stan konta " + account1.getBalance());
                    break;
                case 5:
                    System.out.println("Do widzenia");

            }
        } while (wybor != 5);
    }
}
