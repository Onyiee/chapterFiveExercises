package exerciseFivePointOneSeven;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SalesCalculatorTest {
    SalesCalculator salesCalculator;

    @BeforeEach
    void setUp() {
        salesCalculator = new SalesCalculator();
    }

    @AfterEach
    void tearDown() {
        salesCalculator = null;
    }

    @Test
    void testForProductNumber(){
        salesCalculator.setProductNumber( 2);
        assertEquals(2,salesCalculator.getProductNumber());
    }
    @Test
    void testThatProductNumberReturnsPrice(){
        salesCalculator.setProductNumber(1);
        assertEquals(2.98,salesCalculator.getPrice());
    }
}