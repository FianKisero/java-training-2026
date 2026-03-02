package DevsecOpsexercise;

// src/test/java/com/example/CalculatorTest.java


import DevOpsexercise.CalculatorDevOps;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {

    @Test
    void testAddition() {
        CalculatorDevOps calc = new CalculatorDevOps();
        assertEquals(5, calc.add(2, 3));
    }
}
