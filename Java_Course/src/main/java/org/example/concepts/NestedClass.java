package main.java.org.example.concepts;

public class NestedClass {

    class NestedOne{
        void show(){
            System.out.println("I am nested method return type void of the nested class NestedOne");
        }

        class NestedClassInsideOne{
            void nestedInsideOneMethod(){
                System.out.println("I am nested inside class NestedOne belonging to NestedClassInsideOne");
            }
        }
    }

    //static class
    static class StaticClassMember{
        static void staticMethod(){
            System.out.println("I am static method of the static class StaticClassMember");
        }

        class NonStaticClassInsideStaticClass{
            void nonStaticClassShow(){
                System.out.println("I am method of a non static class nested inside a static class member");
            }
        }
    }


    public static void main(String[] args) {
        StaticClassMember.staticMethod();

        //Invoking method of nestedOne class.
        NestedClass.NestedOne nestedOneReference = new NestedClass().new NestedOne();
        nestedOneReference.show();

        //Invoking nested class inside nestedOne class.
        NestedClass.NestedOne.NestedClassInsideOne referenceToInnerClass = new NestedClass().new NestedOne().new NestedClassInsideOne();
        referenceToInnerClass.nestedInsideOneMethod();

        //invoking nested static class.
        NestedClass.StaticClassMember.staticMethod();

        //invoking non-static class method inside static class.
        StaticClassMember staticNestedClassInstance = new StaticClassMember();
        //we are then creating instance of the non-static nested class from the instance of the static class.
        StaticClassMember.NonStaticClassInsideStaticClass nonStaticClassRef = staticNestedClassInstance.new NonStaticClassInsideStaticClass();
        nonStaticClassRef.nonStaticClassShow();

    }
}
