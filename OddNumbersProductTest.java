package exerciseFivePointOneTwo;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OddNumbersProductTest {
    OddNumbersProduct oddNumbersProduct;

    @BeforeEach
    void setUp() {
        OddNumbersProduct oddNumbersProduct = new OddNumbersProduct();
    }

    @AfterEach
    void tearDown() {
        oddNumbersProduct = null;
    }

    @Test
    void testThatAcceptsNumber(){
        oddNumbersProduct.setNumber(3);
        assertEquals(3,oddNumbersProduct.getNumber());
    }
}