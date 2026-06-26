package org.example.java8.methodReference;


import java.util.function.Supplier;

@FunctionalInterface
interface SupplierInterface{
    void run();

    default String getMessage(){
        return "Hello Supplier";
    }
}

public class SupplierMethodReferenceExample {
    public static void main(String[] args) {
        SupplierInterface supplierInterface = () -> System.out.println("Run");
        Supplier<String> supplier = supplierInterface::getMessage;
        System.out.println(supplier.get());
    }
}
