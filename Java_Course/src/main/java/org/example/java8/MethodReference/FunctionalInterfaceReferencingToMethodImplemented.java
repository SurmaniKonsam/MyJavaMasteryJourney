package main.java.org.example.java8.MethodReference;

/**
 * Method Reference
 * A functional interface referencing to the method implemented in the current class.
 * Method implemented must have same method behaviour as that of the custom functional interface method.
 */
@FunctionalInterface
interface CallOfDuty{
    void cleaningProcessStarted(String start);
}
public class FunctionalInterfaceReferencingToMethodImplemented {

    void startCleaning(String captainOrder){
        System.out.println("Team Alpha roll on command : "+captainOrder);

    }
    public static void main(String[] args) {
        FunctionalInterfaceReferencingToMethodImplemented functionalInterfaceReferencingToMethodImplemented = new FunctionalInterfaceReferencingToMethodImplemented();
        /**
         * Object to method instance reference.
         */
        CallOfDuty callOfDuty = functionalInterfaceReferencingToMethodImplemented::startCleaning;
        callOfDuty.cleaningProcessStarted("Roger");
    }
}
