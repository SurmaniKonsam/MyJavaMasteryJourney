package org.example.solidPrinciples.ocp;

class UPIPayment implements PaymentMethod{
    @Override
    public void pay(){
        System.out.println("UPI Payment");
    }
}
