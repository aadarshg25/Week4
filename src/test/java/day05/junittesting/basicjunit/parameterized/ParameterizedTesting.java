package day05.junittesting.basicjunit.parameterized;

import com.tit.week04.day05.junit.basicjunit.parameterized.Parameterized;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;


public class ParameterizedTesting {
    static Parameterized parameterized;
    @BeforeAll
    static void setUp(){
        parameterized = new Parameterized();
    }
    @ParameterizedTest
    @ValueSource(ints = {2 , 4 , 6 ,7 ,9})
    void testEvenNumbers(int number){
        assertTrue(parameterized.isEven(number));
    }
}
