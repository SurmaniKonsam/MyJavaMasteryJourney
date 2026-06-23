package org.example.SOLID_Principles.OCP;

class WalletPayment implements PaymentMethod{
    @Override
    public void pay(){
        System.out.println("Wallet Payment");
    }
}
