package org.example.optional;

import java.util.Optional;

public class OptionalTest {

    /**
     * Be mindful we are validating only for null object or empty objects via optional.
     */
    public static void main(String[] args) {
        Optional<Cat> catFetched = returnCatOptional();
        /**
         * Be mindful we are trying to return on optional which is null.
         * Hence, we would be playing with methods which validates null those are:
         * 1. orElse(a default object if in case the optional returns a null)
         * 2. orElseGet(Supplier lambda expression) -> It will return the object returned by the
         * supplier. Hence, the object thus returned must be referenced to the return type object.
         * 3. isEmpty()
         * Let's play with it
         */
        Cat safeCat = catFetched.orElseGet(()->new Cat("Honda",3));
        System.out.println(safeCat.getCatName());
        //Supplier is done

        /**
         * Now, we will check with isPresent()
         * Be mindful isPresent() goes hand to hand with get() and its quite obvious that if the
         * object is present we can get the object
         */
        if(catFetched.isEmpty()){
            System.out.println("Object not present");
        }else{
            System.out.println("Cat age : "+catFetched.get().getAgeOfCat()+
                    " cat name : "+catFetched.get().getCatName());
        }
        //isEmpty() isPresent() done.

        /**
         * Validating via orElse
         */
        Cat orElseCat = catFetched.orElse(new Cat("Street Cat",9));
        System.out.println("Cat name : "+orElseCat.getCatName());

        /**
         * Safe-chaining let's try it.
         * So safe-chaining it sounds as if optional is giving safety measure if we are to
         * find null in mid our journey, and if found, so it has a countermeasure to deal with that
         * hence, let's deal with it. How?
         * Hmmm, quite weird if we are checking nullable, then safe chaining of map must go along
         * with isEmpty, but it's not. Interesting.
         */
        System.out.println(catFetched.map(Cat::getCatName).orElse(orElseCat.getCatName()));
        /**
         * Function<String, Integer> fn = String::length; is similar to:
         * Function<String, Integer> fn = str -> str.length();
         * ClassName::instanceMethod
         *     ↓
         * (instance) -> instance.instanceMethod()
         */


    }

    /**
     * Also, it is used to check for object somewhere in an empty box right.
     * Means it's a collection, should we create a collection then.
     */
    public static Optional<Cat> returnCatOptional(){
        Cat catObject = new Cat("Jimmy falon",3);
        /**
         * Optional.of(returnTypeObject) -> returns the instance of the object that we have passed as
         * argument to Optional.Of()
         */
        return Optional.of(catObject);

    }
}
