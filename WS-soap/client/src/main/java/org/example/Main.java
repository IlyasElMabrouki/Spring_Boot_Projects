package org.example;

import proxy.BankService;
import proxy.BankServiceService;

public class Main {
    public static void main(String[] args) {
        BankService proxy = new BankServiceService().getBankServicePort();
        System.out.println(proxy.dhToEuro(100));
    }
}