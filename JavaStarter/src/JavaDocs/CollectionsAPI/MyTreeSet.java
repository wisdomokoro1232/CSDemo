package JavaDocs.CollectionsAPI;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class MyTreeSet {
    public static void main(String[] args) {
        String[] names = {"Steve", "Jack","William"};

//        For a tree it is ordered based on the compare to function in
        //person class
        //dependent on which condition returns a -1 and a 1. The condition returning -1 brings it to the left/to the start of the list
        Set<Person> persons = new TreeSet<Person>();

        for (String name : names) {
            int randomAge = ThreadLocalRandom.current().nextInt(21,89);
            int randomPhone = ThreadLocalRandom.current().nextInt(1234,9999);

            Person newperson = new Person(name, randomAge);
            newperson.setPhone("555-" + randomPhone);
            persons.add(newperson);
        }

        persons.add(new Person("Jack", 26));
        for (Person people : persons) {
            System.out.println(people.getAge() + " " + people.getName());
        };
    }
}

