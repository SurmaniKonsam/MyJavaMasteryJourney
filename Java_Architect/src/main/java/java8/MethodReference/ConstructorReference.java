package main.java.java8.MethodReference;

import java.util.function.Function;

public class ConstructorReference {
    String constructName;

    ConstructorReference(String constructName){
        this.constructName = constructName;
    }

    public static void main(String[] args){
        Function<String,ConstructorReference> returnsObject = ConstructorReference::new;
        System.out.println("Object returned name : "+returnsObject.apply(returnsObject.getClass().getTypeName()));
    }
}
