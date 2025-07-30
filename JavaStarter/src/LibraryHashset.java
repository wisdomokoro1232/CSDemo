import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

import items.*;

public class LibraryHashset {
    public static void main(String[] args) {
        TreeSet<Item> libItems= new TreeSet<>();
        libItems.add(new Book("Romeo and Juliet", "Shakespeare", 1970));
        libItems.add(new Book("Hamlet", "William Shakespeare", 1973));
        libItems.add(new Book("Midsummer Nights Dream", "Shakespeare", 1978));


        Iterator<Item> listItems = libItems.iterator();
        for (Item i: libItems) {
            System.out.println(i.getTitle());
            i.setISBN(ThreadLocalRandom.current().nextInt(100000,999999));
        }

        while (listItems.hasNext()) {
            Item i = listItems.next();
            i.getDetails();
        }
    }
}
