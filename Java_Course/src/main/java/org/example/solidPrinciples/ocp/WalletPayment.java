package org.example.solidPrinciples.ocp;

class WalletPayment implements PaymentMethod{
    @Override
    public void pay(){
        System.out.println("Wallet Payment");
    }
}
