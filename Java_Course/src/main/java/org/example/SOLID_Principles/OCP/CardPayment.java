package org.example.SOLID_Principles.OCP;

class CardPayment implements PaymentMethod{
    @Override
    public void pay(){
        System.out.println("Card Payment Method");
    }
}
