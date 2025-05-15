package org.example.SetterConstructorPropertyDIPackage;

public class SetValueClass {
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "SetValueClass{" +
                "age=" + age +
                '}';
    }
}
