package exerciseFivePointOneThree;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactorialsTest {
    Factorials factorials;

    @BeforeEach
    void setUp() {
        factorials = new Factorials();
    }

    @AfterEach
    void tearDown() {
        factorials = null;
    }

    @Test
    void testToAcceptNumber(){
        factorials.setNumber(20);
        assertEquals(20, factorials.getNumber());
    }

    @Test
    void testToGetFactorials(){
        factorials.setNumber(20);
        factorials.getFactorials();
        long value=factorials.getFactorials();
      assertEquals( value, factorials.getFactorials());
    }

}