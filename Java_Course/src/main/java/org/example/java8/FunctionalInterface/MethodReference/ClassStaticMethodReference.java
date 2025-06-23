package main.java.org.example.java8.FunctionalInterface.MethodReference;


import java.util.Scanner;
import java.util.function.Consumer;

@FunctionalInterface
interface StaticMethodReferenceClass{
    void abstractMethod(String arg);

}
public class ClassStaticMethodReference {
    public static void main(String[] args) {
        StaticMethodReferenceClass staticMethodReferenceClass = (arg)-> System.out.println("Hello world " + arg);
        Consumer<String> consumer = staticMethodReferenceClass::abstractMethod;
        consumer.accept("James");
    }

}
