package day05.junittesting.basicjunit.listmanager;

import static org.junit.jupiter.api.Assertions.*;

import com.tit.week04.day05.junit.basicjunit.listmanager.ListManager;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

class ListManagerTesting {

    ListManager listManager;
    List<Integer> testList;

    @BeforeEach
    void setUp() {
        listManager = new ListManager();
        testList = new ArrayList<>();
    }

    @Test
    void testAddElement() {
        listManager.addElement(testList, 5);
        assertTrue(testList.contains(5));
        assertEquals(1, testList.size());
    }

    @Test
    void testRemoveElement() {
        testList.add(5);
        testList.add(10);
        listManager.removeElement(testList, 5);
        assertFalse(testList.contains(5));
        assertEquals(1, testList.size());
    }

    @Test
    void testGetSize() {
        assertEquals(0, listManager.getSize(testList));
        testList.add(5);
        assertEquals(1, listManager.getSize(testList));
    }
}

