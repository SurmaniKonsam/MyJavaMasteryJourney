package main.java.org.example.concepts.Polymorphism;

public class InheritanceIsA {
    int legs;

    void show(){
        System.out.println("I am method of inheritanceIsA "+legs);
    }
}

class B extends InheritanceIsA{
    B(){
        /**
         * parent variable initialised in the constructor of the child class.
         */
        super.legs = 89;
        super.show();
    }


    public static void main(String[] args) {
        B b = new B();
        /**
         * Child/subclass can inherite or call the method of the parent class.
         */
    }
}
