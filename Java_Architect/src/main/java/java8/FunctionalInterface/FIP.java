package java8.FunctionalInterface;

@FunctionalInterface
interface Attempt{
    public void share();
}
public class FIP {
    public static void main(String[] args) {
        Attempt attempt = () -> {
            System.out.println("Hello");
        };
        attempt.share();
    }
}
