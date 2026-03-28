package org.example.TwentyLPAPackage.Collection.HashMap;


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
        if(this == obj){
            return true;
        }else if(obj == null){
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
}
