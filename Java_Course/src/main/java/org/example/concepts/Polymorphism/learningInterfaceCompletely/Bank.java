package org.example.concepts.Polymorphism.learningInterfaceCompletely;

public class Bank {
    public static void main(String[] args) {
        Account account = new SavingMoney();
        account.showMoney();
    }
}
