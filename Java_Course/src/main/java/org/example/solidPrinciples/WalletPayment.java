package org.example.solidPrinciples;

class WalletPayment implements PaymentMethod{
    @Override
    public void pay(){
        System.out.println("Wallet Payment");
    }
}
