package main.java.java8.MethodReference;


import java.util.function.Consumer;

@FunctionalInterface
interface StaticMethodReferenceClass{
    void abstractMethod(String arg);

}
public class ClassInstanceMethodReference {
    public static void main(String[] args) {
        StaticMethodReferenceClass staticMethodReferenceClass = (arg)-> System.out.println("Hello world " + arg);
        Consumer<String> consumer = staticMethodReferenceClass::abstractMethod;
        consumer.accept("James");
    }

}
