package java8.FunctionalInterface;

@FunctionalInterface
interface FunctionalInterfaceAdapter{
    public void share();
}
public class FIPAdapter {
    public static void main(String[] args) {
        FunctionalInterfaceAdapter functionalInterfaceAdapter = ()->{
            System.out.println("implementing abstract method body here, yes we can implement functional interface abstract method using lambda expression");
        };
        Runnable runnable = functionalInterfaceAdapter::share;
        Thread thread = new Thread(runnable);
        thread.start();

    }
}
