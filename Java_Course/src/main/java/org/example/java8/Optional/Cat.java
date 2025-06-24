package main.java.org.example.java8.Optional;

import java.util.ArrayList;
import java.util.List;

/**
 * Defining custom Cat pojo
 *
 */
public class Cat {
    String catName;
    int ageOfCat;
    Cat(String catName,int age){
        this.catName = catName;
        this.ageOfCat = age;
    }

    public String getCatName() {
        return catName;
    }

    public int getAgeOfCat() {
        return ageOfCat;
    }

    public Cat returnCatObject(){
        return new Cat("Hero Hamada",5);
    }
}
