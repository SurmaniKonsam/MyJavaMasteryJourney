package Inheritance.ConcretClassInheritance;

class ParentClass {
    void fight(){
        System.out.println("Fight for your dreams!!!!");
    }

    void learn(){
        System.out.println("Learn like a god!!!");
    }
}

class Child1 extends ParentClass{

    void art(){
        System.out.println("A child must be good in arts to!!!");
    }

    void fight(){
        System.out.println("Fight for your rights!!!");
        super.learn();
        this.art();
    }


}

class Child2 extends Child1{
    void fight(){
        System.out.println("Fight for power");
    }

    void writeAffirmations(){
        System.out.println("I am a self made 10 million dollar worth self made indie developer who is a developing god!!!");
    }
}

/**
 * Public key word must always be at the main defined class.
 */
public class MainClass{
    public static void main(String[] args) {

        /**
         * The example given below is called -> Upcasting (Parent reference ← Child object)
         * Because all child has the attribute of parent but
         */
        ParentClass parentClass = new Child1();
        /**
         * parent class when points to the common attribute, it will point to the child attribute.
         */
        parentClass.fight();
        parentClass.learn();

        //parentClass.art(); -> parent class cannot refer to the unique attribute in child class.
    }
}
