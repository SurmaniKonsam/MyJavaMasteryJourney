package org.example.concepts.Polymorphism.learningInterfaceCompletely;

public class Bank {
    public static void main(String[] args) {
        Account account = new SavingMoney();
        System.out.println(account.getMoney());
    }
}
