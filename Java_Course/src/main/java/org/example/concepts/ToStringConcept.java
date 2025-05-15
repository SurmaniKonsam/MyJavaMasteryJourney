package main.java.org.example.concepts;

import java.util.Scanner;

public class ToStringConcept {

    private String name = "";
    private String designation = "";

    private int age;

    private String companyName = "";

    public void setDetails(String name,String designation,int age,String companyName){
        this.name = name;
        this.designation = designation;
        this.age = age;
        this.companyName = companyName;
    }

    public void askForCredentials(){
        Scanner scanObj = new Scanner(System.in);
        System.out.println("Enter the employeeName");
        String name = "";
        name = scanObj.next();
        System.out.println("Enter the employee designation");
        String designation = "";
        designation = scanObj.next();
        System.out.println("Enter the employee age");
        int age = scanObj.nextInt();
        System.out.println("Enter the company name");
        String companyName = scanObj.next();
        setDetails(name,designation,age,companyName);
    }

    public String toString(){
        return name+" of designation : "+designation+" age : "+age+" works in company : "+companyName;
    }

    public static void main(String[] args) {
        ToStringConcept toStringConcept = new ToStringConcept();
        toStringConcept.askForCredentials();
        System.out.println(toStringConcept.toString());
    }
}
