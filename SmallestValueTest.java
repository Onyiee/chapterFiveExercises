package exerciseFivePointOneOne;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SmallestValueTest {
    SmallestValue smallestValue;

    @BeforeEach
    void setUp() {
        smallestValue = new SmallestValue();
    }

    @AfterEach
    void tearDown() {
        smallestValue = null;
    }

    @Test
    void testThatNumberCanBeEntered(){
        smallestValue.setNumber(9);
        assertEquals(9,smallestValue.getNumber());
    }

    @Test
    void testThatNumberEnteredIsTheNumberOfInputsAUserCanEnter(){
        smallestValue.setNumber(5);
        assertEquals(5,smallestValue.getUserInput());
    }


}