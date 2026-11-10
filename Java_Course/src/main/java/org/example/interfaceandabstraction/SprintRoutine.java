package org.example.interfaceandabstraction;


/**
 * So, we studied that, an Abstraction is a class which holds common foundation
 * ground for all the bodies or entities to have derived from the parent.
 * The very reason, every class to ever extend the abstract class must implement
 * the abstract method no matter what.
 * But, the abstract method may have its own implementation because different entity
 * or child, to have derived from the parent must be having its own design
 * or implementation.
 *
 * Remember, an Abstract class may or may-not have an abstract method, but
 * if a method is annotated by abstract keyword, the class must be abstract
 *
 * The states, or the variables are the meat of the method, the variables
 * works as a designing parameters or variable which helps in designing the
 * method.
 */
public abstract class SprintRoutine {
    int sec = 90; //for hold
    int descend = 10; //to descend in 10 sec
    int sprintSec = 12;
    int meters = 100;

    void sprintRun(){
        System.out.println("To complete "+meters+" in "+sprintSec);
    }

    //exercises required.
    protected abstract void negativeSquats();
    protected abstract void horseStand();
    protected abstract void polyMetricsJump();
}
