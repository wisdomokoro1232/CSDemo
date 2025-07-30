package Test;

import items.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class ItemTest {
    private Item entry;
    private Item periodicalEntry;
    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
    @BeforeEach
    public void setUp() {
        entry = new Book("Hey","auth1",2025);
        periodicalEntry = new Periodicals("Period1", "auth2", 2021);
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @AfterEach
    public void tearDown() {
        System.setOut(standardOut);
    }

    @Test
    public  void testItem(){
        assertInstanceOf(Item.class, entry);
    }

    @Test
    void borrowPeriodicals() {
        periodicalEntry.borrow();
        assertEquals("Periodicals cannot be borrowed",outputStreamCaptor.toString()
                .trim());
    }

    @Test
    void borrowVariable(){
        assertTrue(!entry.isBorrowed);
    }

    @Test
    void borrowNonPeriodical(){
        entry.borrow();
        assertTrue(entry.isBorrowed);
        entry.borrow();
        assertEquals("Book has already been borrowed",outputStreamCaptor.toString()
                .trim());
    }
}