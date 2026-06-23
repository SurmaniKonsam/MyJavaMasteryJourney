package org.example.SOLID_Principles.OCP;

class UPIPayment implements PaymentMethod{
    @Override
    public void pay(){
        System.out.println("UPI Payment");
    }
}
