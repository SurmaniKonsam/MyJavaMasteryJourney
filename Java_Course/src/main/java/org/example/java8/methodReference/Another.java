package main.java.org.example.java8.MethodReference;


import java.util.function.Consumer;

@FunctionalInterface
interface AnotherInterface{
    void show(String args);
}

public class Another implements AnotherInterface{

    @Override
    public void show(String args){
        System.out.println("Hello "+args);
    }
    public static void main(String[] args) {
        AnotherInterface anotherInterface = (x)-> System.out.println("Hello world");
        /**
         * Be mindful if you are defining argument in the functional interface it should be defined in the
         * abstract method as well.
         */
        Consumer<String> consumer = anotherInterface::show;
        consumer.accept("S");
    }
}
