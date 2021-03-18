import static org.junit.jupiter.api.Assertions.*;

class ObjectListTest {

    private ObjectList myObjectList;
    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        myObjectList = new ObjectList(3);
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
        myObjectList = null;
    }

    @org.junit.jupiter.api.Test
    void add() {
        assertTrue(myObjectList.add(8));

    }

    @org.junit.jupiter.api.Test
    void isEmpty() {
        assertTrue(myObjectList.isEmpty());

        myObjectList.add(1);
        myObjectList.add(2);
        assertFalse(myObjectList.isEmpty());
    }

    @org.junit.jupiter.api.Test
    void isFull() {
        assertFalse(myObjectList.isFull());
        myObjectList.add(1);
        myObjectList.add(2);
        myObjectList.add(4);
        assertTrue(myObjectList.isFull());

    }

    @org.junit.jupiter.api.Test
    void getItem() {
        myObjectList.add(1);
        myObjectList.add(2);
        myObjectList.add(4);

        assertEquals(2,myObjectList.getItem(2));
    }

    @org.junit.jupiter.api.Test
    void getTotal() {
        myObjectList.add(1);
        myObjectList.add(2);
        myObjectList.add(4);

        assertEquals(3,myObjectList.getTotal());
    }

    @org.junit.jupiter.api.Test
    void remove() {
        myObjectList.add(1);
        myObjectList.add(2);
        myObjectList.add(4);

        assertTrue(myObjectList.remove(1));

    }

    @org.junit.jupiter.api.Test
    void testToString() {
        myObjectList.add(1);
        myObjectList.add(2);
        myObjectList.add(4);

        assertEquals("[  1  2  4  ]", myObjectList.toString());
    }
}