package day05.junittesting.basicjunit.databaseconnection;

import static org.junit.jupiter.api.Assertions.*;

import com.tit.week04.day05.junit.basicjunit.databaseconnection.DatabaseConnection;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DatabaseConnectionTesting {
    DatabaseConnection databaseConnection;
    @BeforeEach
    void setUp(){
        databaseConnection = new DatabaseConnection();
        databaseConnection.connect();
    }
    @AfterEach
    void close(){
        databaseConnection.disconnect();
    }
    @Test
    void testConnectionEstablished(){
        assertEquals(databaseConnection.isConnected(),true);
    }
    @Test
    void testConnectionClosedAfterTest() {
        assertTrue(databaseConnection.isConnected(), "Database closed successfully After Each case ");
    }

}
