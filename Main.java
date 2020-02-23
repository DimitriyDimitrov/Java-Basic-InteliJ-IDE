package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Account didAccount = new Account("12345", 0.00, "DID ", " mymail.did@.com ", "0877512207");
        System.out.println(didAccount.getNumber());
        System.out.println(didAccount.getBalance());

        didAccount.withdrawal(100.0);

        didAccount.deposit(50.0);
        didAccount.withdrawal(100.0);

        didAccount.deposit(51.0);
        didAccount.withdrawal(100.0);

        Account secondAccount = new Account("D", "dimeil.com", "12345");
        System.out.println(secondAccount.getNumber() + " name " + secondAccount.getCustomerName());


        VipPerson person1 = new VipPerson();
        System.out.println(person1.getName());

        VipPerson person2 = new VipPerson("Michael", 25000.00);
        System.out.println(person2.getName());

        VipPerson person3 = new VipPerson("Will", 100.00, "willemail.com");
        System.out.println(person3.getName());


    }
}
