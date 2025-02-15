package day05.junittesting.advancedjunit.userregistration;

import static org.junit.jupiter.api.Assertions.*;
import com.tit.week04.day05.junit.advancedjunit.userregistration.UserRegistration;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class UserRegistrationTesting{
    private UserRegistration userRegistration;

    @BeforeEach
    void setUp() {
        userRegistration = new UserRegistration();
    }

    @Test
    void testValidUserRegistration() {
        assertDoesNotThrow(() -> userRegistration.registerUser("Aadarsh", "srgsrgg@gmail.com", "StrongPass1"));
    }

    @Test
    void testEmptyUsername() {
        Exception exception = assertThrows(IllegalArgumentException.class,
                () -> userRegistration.registerUser("", "defesee@gmail.com", "StrongPass1"));
        assertEquals("Username cannot be empty", exception.getMessage());
    }

    @Test
    void testInvalidEmail() {
        Exception exception = assertThrows(IllegalArgumentException.class,
                () -> userRegistration.registerUser("Ankit", "invalid-email", "StrongPass1"));
        assertEquals("Invalid email format", exception.getMessage());
    }

    @Test
    void testShortPassword() {
        Exception exception = assertThrows(IllegalArgumentException.class,
                () -> userRegistration.registerUser("Aditya", "rajgupta49102@gmail.com", "12345"));
        assertEquals("Password must be at least 8 characters long", exception.getMessage());
    }
}