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

    }
}
