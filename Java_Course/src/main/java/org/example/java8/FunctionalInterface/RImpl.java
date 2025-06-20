package main.java.org.example.java8.FunctionalInterface;


@FunctionalInterface
interface DummyFI{
    void startTheEngine();
}
public class RImpl {
    public static void main(String[] args) {
        DummyFI dummyFI = ()->System.out.println("Broom broom broooooooommmmmm!!!!!");
        /**
         * Runnable can be referred to another functional method invoked via lambda expression wrapping.
         * 1. Implement the functional interface, be mindful of the runnable run void method().
         * 2. Get the runnable instance and wrap the custom functional interface with the lambda expression.
         *  This will let the runnable implicitly invoke run method.
         *  Runnable runnableAlt = () -> dummyFI.startTheEngine();
         *  Or
         *  Runnable runnable = dummyFI::startTheEngine;
         *  You can even method refer the custom functional interface method via method reference.
         * 3. Put the runnable reference into the thread, since thread instance takes runnable as a reference.
         * 4. Start the thread you are good to go
         */
        Runnable runnable = dummyFI::startTheEngine;
        Thread thread = new Thread(runnable);
        thread.start();
    }
}
