package java8.FunctionalInterface;

import java.util.function.Consumer;

@FunctionalInterface
interface Example{
    void displayName(String str);
}

public class Dummy {
        public static void main(String[] args){
        /*
            Now, as discussed above functional interface or any interface must have its abstract method defined
            if we are using it. But, we will be skipping the traditional approach and go for the new declarative java 8
            feature which is "lambda-expression".
        */
            Example exampleImplemented = (x) -> System.out.println("Hello "+x);
        /* Hence, what we observed from this.
        1. No method name defined.
        2. Even we didn't say its void.
        So, everything under the hood is done and observed by Lambda expression.
        Provided you must know how you should map your lambda expression as per the method signature.
        */
            exampleImplemented.displayName("Sham");

        /*
            So this was one approach, but we can even wrap our custom defined functional interface with the existing
            java 8 functional interface such as : Function, predicate, consumer etc.
            How?
            1. You must know what abstract method type does the existing java 8 functional interface have.
            2. If your custom defined functional interface have same method signature as that of the existing
            java 8 functional interface then, you can wrap it up how?
            Let's see
        */
            //1. Get the Custom functional interface implemented
            Example wrapping = (x) -> System.out.println("Hello "+x);
            //2. Get the Java 8 functional interface.
        /*Since, our return type is void, and it takes one string argument the abstract method type behaves like
        consumer*/
            Consumer<String> consumeCustomFunctionalInterface = wrapping::displayName;
            consumeCustomFunctionalInterface.accept("James");


        /* Output
        Hello Sham
        Hello James
        */
        }
}

