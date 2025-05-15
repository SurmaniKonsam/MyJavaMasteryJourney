package main.java.org.example.concepts;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class StaticConcepts {
    static int a;

    static int staticAttribute = 90;

    static void run(){
        System.out.println("run fast");
    }

    static {
        System.out.println("I will get executed first");
        run();
    }

    static class NestedStaticClass{

        static void showingStaticAttribute(){
            System.out.println("Nested class sout outer static attribute : "+staticAttribute);
        }
    }

    public static void main(String[] args) {
        System.out.println("a value is ?"+StaticConcepts.a);
        System.out.println();
        NestedStaticClass.showingStaticAttribute();
    }
}
