package org.example.interfaceandabstraction;


/**
 * An interface if implemented, all its methods need to be implemented.
 */
public class Implementation implements Explosive{
    public void polyMetrics(){
        System.out.println("Pause 3 sec, then shoot as high as you can");
    }

    public static void main(String[] args) {
        new Implementation().polyMetrics();
    }
}
