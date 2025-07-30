import java.util.ArrayList;
import java.util.Optional;
import java.util.Scanner;

import items.*;

import java.util.List;

public class Library {
    static Scanner scn = new Scanner(System.in);

    // Need getter and setter methods
    // All sub classes should be have a universal add/remove item? based on the id number or something
    public static void main(String[] args) throws Exception {
        List<Item> libraryItems = new ArrayList<>();
        int option = 0;
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome to the Midnight Library, Set out before you are memories from your past \n Now you must choose what form to store them in");
        //Do while ensures that they are given the chance to answer first before evaluating the value of option
//        while (option != 5) {
//            listItems(libraryItems);
//            System.out.println("\n1 - Add item \n 2- Borrow Item \n 3- See Library catalogue \n 4 - Remove item from Library Catalogue\n 5 - Leave the library");
//            option = scn.nextInt();
//            scn.nextLine();
//            switch (option) {
//                case 1:
//                    addItem(scn, libraryItems);
//                    break;
//                case 2:
//                    findItem(scn, libraryItems).borrow();
//                    break;
//                case 3:
//                    listItems(libraryItems);
//                    break;
//                case 4:
//                    removeItemFromLibrary(scn, libraryItems);
//                    break;
//                case 5:
//                    break;
//                default:
//                    break;
//            }
//        }
//
//        System.out.println("Thanks for visiting the midnight library, have a good day!");
//    }
        do {
            listItems(libraryItems);
            System.out.println("\n1 - Add item \n 2- Borrow Item \n 3- See Library catalogue \n 4 - Remove item from Library Catalogue\n 5 - Leave the library");
            option = scn.nextInt();
            scn.nextLine();
            switch (option) {
                case 1:
                    addItem(scn, libraryItems);
                    break;
                case 2:
                    findItem(scn, libraryItems).borrow();
                    break;
                case 3:
                    listItems(libraryItems);
                    break;
                case 4:
                    removeItemFromLibrary(scn, libraryItems);
                    break;
                case 5:
                    break;
                default:
                    break;
            }
        }
        while (option != 5);
        System.out.println("Thanks for visiting the midnight library, have a good day!");
    }

    public static void addItem(Scanner scn, List<Item> library) {
        System.out.println("Enter mediaType: ");
        String mediaType = scn.nextLine();
        System.out.println("Enter title, author and release date seperated by commas as so: title,author,releaseDate \n At a minimum the title is necessary ");
        Optional<String> author = Optional.ofNullable(scn.next(","));
        System.out.println(" Enter the release date: ");
        Optional<String> releaseDate = Optional.ofNullable(scn.next(","));
        System.out.println("Enter title: ");
        Optional<String> title = Optional.ofNullable(scn.next(","));
        switch (mediaType.toLowerCase()) {
            case "book":
                library.add(new Book(title.orElse("N/A"), author.orElse("N/A"), Integer.parseInt(releaseDate.orElse("0000"))));
                break;
            case "dvd":
                library.add(new DVD(title.orElse("N/A"), author.orElse("N/A"), Integer.parseInt(releaseDate.orElse("0000"))));
            case "journal":
                library.add(new Journal(title.orElse("N/A"), author.orElse("N/A"), Integer.parseInt(releaseDate.orElse("0000"))));
                break;
//            case "periodicals":
//                library.add(new Periodicals(title.orElse("N/A"), author.orElse("N/A"), releaseDate.orElse("N/A")));
//                break;
                default:
                System.out.println("We do not offer such storage options");
                break;
        }
    }

    public static void listItems(List<Item> library) {
        if (!library.isEmpty()) {
            for (int i = 1; i <= library.size(); i++) {
                System.out.printf(i + ". ");
                library.get(i - 1).getDetails();
            }
        }
    }

    public static Item findItem(Scanner scn, List<Item> library) throws Exception {
        System.out.println("Which item - use the catalogue index, or enter 0 if you want the library listed");
        int option = scn.nextInt();
        if (option == 0) {
            listItems(library);
        }
        option = scn.nextInt();
        try {
            return library.get(option - 1);
        } catch (IndexOutOfBoundsException e)
        {
            System.err.println("Index Invalid, that does not exist in our catalogue!");
        } catch (Exception e) {
            System.err.println();
        }
        return null;
    }

    public static void removeItemFromLibrary(Scanner scn, List<Item> library) throws Exception {
        library.remove(findItem(scn, library));
    }

//    public static void modifyEntry(Scanner scn, List<Item> library){
//
//    }
}
