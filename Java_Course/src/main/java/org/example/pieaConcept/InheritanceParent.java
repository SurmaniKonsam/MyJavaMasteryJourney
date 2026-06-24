package org.example.pieaConcept;


/**
 * Multi-level inheritance
 * How to remember? -> It does look like a level after.
 */
class Parent{
    void run(){
        System.out.println("Run for success Parent");
    }
}

class Child extends Parent{
    void run(){
        System.out.println("Run for money Child1");
    }
}


class Child2 extends Child{
    void run(){
        System.out.println("Run for health Child2");
    }
}


public class InheritanceParent {
    public static void main(String[] args){
        /**
         * So it's true, a base class can point or referred to all the derived class.
         * And also Multi-level inheritance works kinda like chaining system, the base class can refer to all its
         * derived class as long as the chain is maintained via its intermediary classes.
         */
        Parent parent = new Parent();
        Parent parent1 = new Child();
        /**
         * Child acts as intermediary child here, which chain bases class Parent with Child2, and same when extended
         * further Child2 will act the same for Child and its derived classes.
         *
         */
        Parent parent2 = new Child2();

        Child child = new Child();
        Child child1 = new Child2();
        Child2 child2 = new Child2();

        parent.run();
        parent1.run();
        parent2.run();
        child.run();
        child1.run();
        child2.run();
    }
}
