package org.example.Hometask1.task1;

import org.example.Hometask1.Printable;

//шаблон для создания обьекта
public class BankAccountMain3 implements Printable {
    private String accountNumber;
    private int balance;

    //сеттеры
    public void setBalance(int balance) {
        this.balance = balance;
    }

    // геттеры
    public int getBalance() {
        return this.balance;
    }

    @Override
    public void print() {
        System.out.println("Account balance: " + this.balance);
    }
}

