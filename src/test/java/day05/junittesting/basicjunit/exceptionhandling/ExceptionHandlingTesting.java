package day05.junittesting.basicjunit.exceptionhandling;

import static org.junit.jupiter.api.Assertions.*;
import com.tit.week04.day05.junit.basicjunit.exceptionhandling.ExceptionHandling;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
public class ExceptionHandlingTesting {
    static ExceptionHandling exceptionHandling;

    @BeforeAll
    static void setUp(){
        exceptionHandling = new ExceptionHandling();
    }

    @Test
    void testDivide() {
        // Valid division cases
        assertDoesNotThrow(() -> exceptionHandling.divide(10, 2));
        assertEquals(5, exceptionHandling.divide(10, 2));
    }

    @Test
    void testDivideByZero() {
        Exception exception = assertThrows(ArithmeticException.class, () -> exceptionHandling.divide(10, 0));
        assertEquals("/ by zero", exception.getMessage());
    }
}

