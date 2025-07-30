import items.Book;
import items.Periodicals;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;
import items.DVD;
import items.Journal;
import items.Item;
import java.io.*;
import java.util.*;

class LibraryTest {
    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @AfterEach
    public void tearDown() {
        System.setOut(standardOut);
    }

    @Test
    void addItem_addsBookToLibrary() {
        String input = "book\n\nAuthor\n2020\nTitle\n";
        Scanner scanner = new Scanner(new ByteArrayInputStream(input.getBytes()));
        List<Item> library = new ArrayList<>();
        Library.addItem(scanner, library);
        assertEquals(1, library.size());
        assertTrue(library.get(0) instanceof Book);
    }

    @Test
    void addItem_invalidType_printsError() {
        String input = "unknown\n\nAuthor\n2020\nTitle\n";
        Scanner scanner = new Scanner(new ByteArrayInputStream(input.getBytes()));
        List<Item> library = new ArrayList<>();
        Library.addItem(scanner, library);
        assertTrue(outputStreamCaptor.toString().contains("We do not offer such storage options"));
        assertEquals(0, library.size());
    }

    @Test
    void listItems_printsItems() {
        List<Item> library = new ArrayList<>();
        library.add(new Book("Title1", "Author1", 2001));
        library.add(new DVD("Title2", "Author2", 2002));
        Library.listItems(library);
        String output = outputStreamCaptor.toString();
        assertTrue(output.contains("1."));
        assertTrue(output.contains("2."));
    }

    @Test
    void findItem_returnsCorrectItem() throws Exception {
        List<Item> library = new ArrayList<>();
        library.add(new Book("Title1", "Author1", 2001));
        library.add(new DVD("Title2", "Author2", 2002));
        String input = "2\n";
        Scanner scanner = new Scanner(new ByteArrayInputStream(input.getBytes()));
        Item found = Library.findItem(scanner, library);
        assertNotNull(found);
        assertEquals("Title2", found.getTitle());
    }

    @Test
    void findItem_invalidIndex_returnsNull() throws Exception {
        List<Item> library = new ArrayList<>();
        library.add(new Book("Title1", "Author1", 2001));
        String input = "5\n";
        Scanner scanner = new Scanner(new ByteArrayInputStream(input.getBytes()));
        Item found = Library.findItem(scanner, library);
        assertNull(found);
    }

    @Test
    void removeItemFromLibrary_removesItem() throws Exception {
        List<Item> library = new ArrayList<>();
        library.add(new Book("Title1", "Author1", 2001));
        String input = "1\n";
        Scanner scanner = new Scanner(new ByteArrayInputStream(input.getBytes()));
        Library.removeItemFromLibrary(scanner, library);
        assertEquals(0, library.size());
    }
}
