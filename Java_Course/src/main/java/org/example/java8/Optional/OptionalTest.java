package main.java.org.example.java8.Optional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class OptionalTest {

    public void checkIfCollectionHaveNullOrNot(List<String> collections){
        Optional<List<String>> check = Optional.of(collections);
        for (String collection : collections) {
            System.out.println(collection);
        }
    }

    public List<String> getCollections(){
        List<String> checkingCollection = new ArrayList<>();
        checkingCollection.add(null);
        checkingCollection.add("Hi");
        checkingCollection.add(null);
        checkingCollection.add("dsafd");
        checkingCollection.add("dsafd");
        checkingCollection.add("dsafd");
        checkingCollection.add("dsafd");
        checkingCollection.add("dsafd");

        return checkingCollection;
    }

    public static void main(String[] args) {
        



    }
}
