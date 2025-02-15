package day05.junittesting.basicjunit.stringutility;

import static org.junit.jupiter.api.Assertions.*;

import com.tit.week04.day05.junit.basicjunit.stringutility.StringUtility;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class StringUtilityTesting {

    static StringUtility stringUtils;

    @BeforeAll
    static void setUp() {
        stringUtils = new StringUtility(); // Object created once before all tests
    }

    @Test
    void testReverse() {
        assertEquals("dcba", stringUtils.reverse("abcd"));
        assertEquals("madam", stringUtils.reverse("madam"));
        assertEquals("", stringUtils.reverse(""));
        assertNull(stringUtils.reverse(null));
    }

    @Test
    void testIsPalindrome() {
        assertTrue(stringUtils.isPalindrome("madam"));
        assertTrue(stringUtils.isPalindrome("Racecar"));
        assertFalse(stringUtils.isPalindrome("hello"));
        assertFalse(stringUtils.isPalindrome(null));
    }

    @Test
    void testToUpperCase() {
        assertEquals("HELLO", stringUtils.toUpperCase("hello"));
        assertEquals("WORLD", stringUtils.toUpperCase("world"));
        assertEquals("", stringUtils.toUpperCase(""));
        assertNull(stringUtils.toUpperCase(null));
    }
}

