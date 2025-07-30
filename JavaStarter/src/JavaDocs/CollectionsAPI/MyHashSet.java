package JavaDocs.CollectionsAPI;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class MyHashSet {
    public static void main(String[] args) {
        String[] names = {"Steve", "Jack","William"};

//        For a hashset it is not necessarily ordered
        Set<Person> persons = new HashSet<Person>();

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
        }
    }
}

