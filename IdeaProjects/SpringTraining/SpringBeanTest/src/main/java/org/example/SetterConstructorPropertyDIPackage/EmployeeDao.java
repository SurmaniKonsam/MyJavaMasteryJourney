package org.example.SetterConstructorPropertyDIPackage;

public class EmployeeDao {
    private int age;
    private String name;
    private String designation;

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getDesignation() {
        return designation;
    }

    @Override
    public String toString() {
        return "EmployeeDao{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", designation='" + designation + '\'' +
                '}';
    }
}
