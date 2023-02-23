import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class MenuTest {

    private Menu menu;
    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    void setUp() {
        menu = new Menu();
    }

    @Disabled
    @Test
    void get() {
        //check that array was initialized with 3 menu items
        MenuItem item0 = menu.get(0);
        assertEquals("french fries", item0.getName());
        assertEquals(3.99, item0.getPrice());

        MenuItem item1 = menu.get(1);
        assertEquals("garden salad", item1.getName());
        assertEquals(8.99, item1.getPrice());

        MenuItem item2 = menu.get(2);
        assertEquals("vegetable soup", item2.getName());
        assertEquals(5.99, item2.getPrice());
    }

    @Disabled
    @Test
    void getOutOfBounds() {
        assertNull(menu.get(-1));
        assertNull(menu.get(3));
    }

    @Disabled
    @Test
    void itemLookup() {
        MenuItem item1 = menu.itemLookup("french fries");
        assertEquals("french fries", item1.getName());
        assertEquals(3.99, item1.getPrice());

        MenuItem item2 = menu.itemLookup("garden salad");
        assertEquals("garden salad", item2.getName());
        assertEquals(8.99, item2.getPrice());
    }

    @Disabled
    @Test
    void itemNotFound() {
        assertNull(menu.itemLookup("onion rings"));
    }

    @Disabled
    @Test
    void adjustPrice() {
        assertTrue(menu.adjustPrice(0, 1.00));
        assertEquals(4.99, menu.get(0).getPrice());

        assertTrue(menu.adjustPrice(1, 2.00));
        assertEquals(10.99, menu.get(1).getPrice());

        assertTrue(menu.adjustPrice(2, -1.50));
        assertEquals(4.49, menu.get(2).getPrice());

        // out of bounds
        assertFalse(menu.adjustPrice(3, 1.00));
        assertFalse(menu.adjustPrice(-1, 1.00));
    }

    @Disabled
    @Test
    void displayMenuItems() {
        System.setOut(new PrintStream(outputStreamCaptor));
        menu.displayMenuItems();

        assertEquals("french fries $3.99\n" +
                        "garden salad $8.99\n" +
                        "vegetable soup $5.99",
                outputStreamCaptor.toString().trim());

        System.setOut(standardOut);
    }
}