package org.example.solidPrinciples.ocp;

class CardPayment implements PaymentMethod{
    @Override
    public void pay(){
        System.out.println("Card Payment Method");
    }
}
