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
        System.out.println("MENU - Wybierz opcje.");
        System.out.println("\n 1 - Wpłata \n 2 - Wypłata \n 3 - Sprawdzenie salda konta \n 4 - Kredyt \n 5 - Wyloguj ");
        System.out.println(" Twój wybór");
        int wybor = sc.nextInt();
        switch (wybor){
            case 1:
                System.out.println("Wpłata gotówki");
                break;
            case 2:
                System.out.println("Wypłata gotówki");
                break;
            case 3:
                System.out.println("Saldo");
                break;
            case 4:
                System.out.println("Kredyt");
                break;
            case 5:
                System.out.println("Do widzenia");

        }
    }
}
