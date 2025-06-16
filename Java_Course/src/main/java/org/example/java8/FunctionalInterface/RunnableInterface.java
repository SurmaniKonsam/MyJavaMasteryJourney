package main.java.org.example.java8.FunctionalInterface;


class RunnableImpl implements Runnable{

    /**
     * Return type is void
     */
    @Override
    public void run() {
        System.out.println("Run in life, race in life, win in life, conquer your destiny!!!");
    }
}

public class RunnableInterface {
    public static void main(String[] args) {
        /**
         * To run or execute the runnable instance you need to have a thread to get that string play.
         */
        Thread thread = new Thread(new RunnableImpl());
        thread.start();

        /**
         * Approaching by way of Functional aka lambda programming
         */
        Runnable runnable = () -> System.out.println("Your choices and your actions, define who you are!!!");
        Thread thread1 = new Thread(runnable);
        thread1.start();

        /**
         * Another approach as well
         */
        Thread thread2 = new Thread(()->{
            System.out.println("Another approach which i remembered!!!");
        });
        thread2.start();
        /*
        Let's deduce something.
        Thread takes in functional programming type style right.
        Runnable is functional interface.

         */

    }

}
