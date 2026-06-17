package concepts;

public class NestedClass {

    private int checkVariable;
    /**
     * Nested class are primarily used for strict overriding, keeping it more private.
     */
    static class NestedOne{
        void show(){
            //System.out.println("I am nested method return type void of the nested class NestedOne");
        }

        static class NestedClassInsideOne{
            void nestedInsideOneMethod(){
                //System.out.println("I am nested inside class NestedOne belonging to NestedClassInsideOne");
            }
        }
    }

    //deep nested class inside main class used for initialisation.
    class SetterClass{
        void setMainClassVariable(int a){
            checkVariable = a;
        }

        //But how is it any different to usual setter/mutator and getter method of encapsulation.
        int getMainClassVariable(){
            return checkVariable;
        }
    }

    //static class
    static class StaticClassMember{
        static void staticMethod(){
            System.out.println("I am static method of the static class StaticClassMember");
        }

        static class NonStaticClassInsideStaticClass{
            void nonStaticClassShow(){
                //System.out.println("I am method of a non static class nested inside a static class member");
            }
        }
    }

    public static void main(String[] args) {
        //StaticClassMember.staticMethod();

        NestedClass nestedClass = new NestedClass();
        SetterClass nestedOne = nestedClass.new SetterClass();
        nestedOne.setMainClassVariable(90);
        System.out.println("value : "+nestedOne.getMainClassVariable());

        //Invoking method of nestedOne class.
        //NestedClass.NestedOne nestedOneReference = new NestedOne();
        //nestedOneReference.show();

        //Invoking nested class inside nestedOne class.
        //NestedClass.NestedOne.NestedClassInsideOne referenceToInnerClass = new NestedOne.NestedClassInsideOne();
        //referenceToInnerClass.nestedInsideOneMethod();

        //invoking nested static class.
        //NestedClass.StaticClassMember.staticMethod();

        //invoking non-static class method inside static class.
        //we are then creating instance of the non-static nested class from the instance of the static class.
        //StaticClassMember.NonStaticClassInsideStaticClass nonStaticClassRef = new StaticClassMember.NonStaticClassInsideStaticClass();
        //nonStaticClassRef.nonStaticClassShow();



    }
}
