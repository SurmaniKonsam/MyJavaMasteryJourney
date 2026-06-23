package org.example.SOLID_Principles.OCP;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Transaction {
    public static void main(String[] args) {
        List<PaymentMethod> allTransactions = new ArrayList<>();
        allTransactions.add(new CardPayment());
        allTransactions.add(new UPIPayment());
        allTransactions.add(new WalletPayment());

        //Iterator<PaymentMethod> itr = allTransactions.iterator();
        /*
        For some reason its always preferred to use for loop instead of Iterator<ParentReturnType>
        why?
         */

        /*
        while(itr.hasNext()){
            itr.next().pay();
        }
         */
        for(PaymentMethod pm : allTransactions){
            pm.pay();
        }


    }
}
