package org.example.solidPrinciples;

class UPIPayment implements PaymentMethod{
    @Override
    public void pay(){
        System.out.println("UPI Payment");
    }
}
