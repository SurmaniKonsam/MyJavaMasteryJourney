package org.example.concepts;

public class NestedClass {

    private int variableToAssign;

    class AssignVariable{
        void setVariableValue(int a){
            variableToAssign = a;
        }

        int getValue(){
            return variableToAssign;
        }
    }

    static class NestedOne{
        void show(){
            System.out.println("I am nested method return type void of the nested class NestedOne");
        }

        static class NestedClassInsideOne{
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

        static class NonStaticClassInsideStaticClass{
            void nonStaticClassShow(){
                System.out.println("I am method of a non static class nested inside a static class member");
            }
        }
    }


    public static void main(String[] args) {

        NestedClass nestedClass = new NestedClass();
        AssignVariable assignVariable = nestedClass.new AssignVariable();
        assignVariable.setVariableValue(423);
        System.out.println(assignVariable.getValue());
        /*
        StaticClassMember.staticMethod();

        //Invoking method of nestedOne class.
        NestedClass.NestedOne nestedOneReference = new NestedOne();
        nestedOneReference.show();

        //Invoking nested class inside nestedOne class.
        NestedClass.NestedOne.NestedClassInsideOne referenceToInnerClass = new NestedOne.NestedClassInsideOne();
        referenceToInnerClass.nestedInsideOneMethod();

        //invoking nested static class.
        NestedClass.StaticClassMember.staticMethod();

        //invoking non-static class method inside static class.
        //we are then creating instance of the non-static nested class from the instance of the static class.
        StaticClassMember.NonStaticClassInsideStaticClass nonStaticClassRef = new StaticClassMember.NonStaticClassInsideStaticClass();
        nonStaticClassRef.nonStaticClassShow();

         */

    }
}
