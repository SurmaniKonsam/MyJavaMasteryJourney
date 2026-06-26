package org.example.java8.functionalInterface.methodReference;

import java.util.Optional;

@FunctionalInterface
interface UnboundReferenceInterface{
    String getName();
}

class Person implements UnboundReferenceInterface{
    String name;
    int age;
    Person(String name,int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
public class UnboundMethodReference {
    public static Optional<Person> checkNullability(String name,int age){
        Person person = new Person(name,age);
        return Optional.ofNullable(null);
    }

    public static void main(String[] args) {
        Optional<Person> checkPerson = checkNullability("Sham",25);
        Person personIfNullExist = new Person("Null Man",3);
        /**
         * So it's the stream out of the mapping or pipe result, which we are then validating with orElse()
         * The argument of the orElse() should have same return type as that of the mapping filter,
         */
        System.out.println(checkPerson.map(Person::getName).orElse(personIfNullExist.getName()));
    }

}
