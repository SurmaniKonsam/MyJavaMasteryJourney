package org.example.thirtyLPAPackage.collection.hashMap;


import java.util.Objects;

class Person{
    String name;
    int id;

    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    /**
     * It means an object will be used here to get it compared with the existing or current object "this".
     */
    @Override
    public boolean equals(Object obj) {
        //this -> object to compare with.
        if(this == obj){
            return true;
        }else if(!(obj instanceof Person)){
            /**
             * Object instanceOf Person means:
             * object belongs to the class or is a subclass or child of the class.
             */
            return false;
        }
        Person pr = (Person) obj;
        return this.id==pr.id && Objects.equals(this.name,pr.name);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}


public class ObjectHashCodeStudy {
    public static void main(String[] args) {
        Person person = new Person("A",2);
        Person person2 = new Person("A",2);
        System.out.println(person.equals(person2));

    }
}
