package main.java.org.example.concepts.Polymorphism;


//parent class
class GrandFather{
    void show(){
        System.out.println("I am grandfather.");
    }

    void identity(){
        System.out.println("I am 75 year old strong and running, my name is Optimus prime!!!");
    }

}

//inherits GrandFather properties
class Father extends GrandFather{
    public void show(){
        System.out.println("I am father.");
    }
}


//inherits Father properties
class Son extends Father{
    public void show(){
        System.out.println("I am son.");
    }
}


//inherits Father properties
class Daughter extends Father{
    public void show(){
        System.out.println("I am a daughter.");
    }
}//end of class.

public class HybridInheritance {
    public static void main(String[] args) {
        Daughter daughter = new Daughter();
        daughter.show();
        daughter.identity();
    }
}
