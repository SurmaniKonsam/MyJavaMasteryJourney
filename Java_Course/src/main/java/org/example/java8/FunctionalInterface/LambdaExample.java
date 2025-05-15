package main.java.org.example.java8.FunctionalInterface;

public class LambdaExample {
    public static void main(String[] args) {
        //passed the reference value
        showShape(()-> System.out.println("Learning lambda"));
        
        LambdaInterface square = () -> System.out.println("Shape of a square");
        LambdaInterface circle = () -> System.out.println("Shape of circle");
        showShape(square);
        showShape(() -> System.out.println("Shape of circle"));
        System.out.println();
        System.out.println(circle);

        //adding two numbers -> Here we are defining the implementation like we did in the service class
        //But by using functional programming.
        //No matter what, the abstract method of the functional interface need to be defined/implemented
        //which here we are using functional programming instead of the old traditional service implementation approach.
       AddTwoNumbers twoNumbers = (a, b) -> a+b;
       System.out.println("sum of two numbers : "+twoNumbers.sum(10,20));
    }

    /**
     * @param lambdaInterface -> It means here we can pass the lambdaInteface as an argument
     * Let's consider A as an lambdaInterface
     * Then, we can put either the reference of A or the value of A itself both will be same.
     * A a = () -> {your defined lambdaExpression};
     * So the reference to LambdaExpression could be either a itself, or the whole lambdaExpression scope that is:
     * () -> {your defined lambdaExpression};
     */
    public static void showShape(LambdaInterface lambdaInterface){
        lambdaInterface.lambdaShape();
    }
}
