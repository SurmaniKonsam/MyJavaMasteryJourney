package main.java.org.example.concepts.Polymorphism;

public class ConstructorInParentClass {

    private int age,salary;
    private double yearsOfExperience;
    private String nameOfTheEmployee;
    private String designation;

    ConstructorInParentClass(int age,int salary,double yearsOfExperience,String nameOfTheEmployee,String designation){
        this.age = age;
        this.salary = salary;
        this.yearsOfExperience = yearsOfExperience;
        this.nameOfTheEmployee = nameOfTheEmployee;
        this.designation = designation;
    }

    public String toString(){
        return nameOfTheEmployee+"\ndesignation : "+designation+"\nyears of experience : "+yearsOfExperience+"\nage "+age+"\nsalary : "+salary;
    }
}

class SubClass extends ConstructorInParentClass{
    SubClass(int age,int salary,double yearsOfExperience,String nameOfTheEmployee,String designation){
        super(age,salary,yearsOfExperience,nameOfTheEmployee,designation);
    }

    void showEmployeeDetails(){
        System.out.println(super.toString());
    }

    public static void main(String[] args) {
        SubClass subClass = new SubClass(27,680000,1.8f,"Surmani Konsam","Associate Consultant");
        subClass.showEmployeeDetails();
    }
}
