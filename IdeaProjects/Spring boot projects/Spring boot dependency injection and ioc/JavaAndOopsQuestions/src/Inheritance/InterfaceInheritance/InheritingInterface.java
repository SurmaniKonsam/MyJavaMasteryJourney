package Inheritance.InterfaceInheritance;


public interface InheritingInterface extends InterfaceTwo, InterfaceOne {
    void fly();
}

class ChildInterface implements InheritingInterface{
    @Override
    public void fly(){
        System.out.println("fly to the glory of unimaginable height");
    }

    @Override
    public void link(){
        System.out.println("Hello!!! link");
    }

    public static void main(String[] args) {
        ChildInterface childInterface = new ChildInterface();
        childInterface.link();
        childInterface.fly();
        InheritingInterface inheritingInterface = new ChildInterface();
        //A different perspective is observed here. When an interface refers to the implements class that is the.
        //it can point or call the overidden method of the implemented class. Just like how we are observing here.
        inheritingInterface.fly();
    }
}
