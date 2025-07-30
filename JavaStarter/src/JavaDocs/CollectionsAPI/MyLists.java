package JavaDocs.CollectionsAPI;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class MyLists {
    public static void main(String[] args) {
        String[] names = {"Steve", "Jack","William"};

//        List is an abstract class while Arraylist is the exact implementation of a list collection
        //Like if you remeber you can instantiate a new class with the interface that it implements
//      //In this case ArrayList implements list so you can create a new ArrayList with List
        List<Person> persons = new ArrayList<Person>();

        for (String name : names) {
            int randomAge = ThreadLocalRandom.current().nextInt(21,89);
            int randomPhone = ThreadLocalRandom.current().nextInt(1234,9999);

            Person newperson = new Person(name, randomAge);

            persons.add(newperson);
        }
        for (Person people : persons) {
            System.out.println(people.getAge() + " " + people.getName());
        };
    }
}

