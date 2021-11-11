package com.uttara.test;

import com.uttara.acc.*;

public class TestAcc {
    public static void main(String[] args) {
        Account account = new com.uttara.acc.bank.BankAccount();
        Person person = new Person(account);
    }
}