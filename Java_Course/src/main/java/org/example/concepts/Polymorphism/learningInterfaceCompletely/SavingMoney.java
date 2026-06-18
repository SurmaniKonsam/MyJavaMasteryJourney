package org.example.concepts.Polymorphism.learningInterfaceCompletely;

public class SavingMoney implements Account{
    @Override
    public int getMoney() {
        return 134233;
    }

    @Override
    public void showMoney(){
        System.out.println(" money : "+getMoney());
    }
}
