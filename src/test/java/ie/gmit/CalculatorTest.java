package ie.gmit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class CalculatorTest {
    Calculator myCalculator;

    @BeforeEach
    void init(){
        myCalculator = new Calculator();
    }

    @DisplayName("Addition Test Check")
    @Test
    void testAddNum() {
        myCalculator = new Calculator();
        assertEquals(11,myCalculator.AddNum(5,6));
    }

    @DisplayName("Addition Test Check")
    @Test
    void testSubNum() {
        myCalculator = new Calculator();
        assertEquals(5,myCalculator.SubNum(10,5));
    }

    @DisplayName("Addition Test Check")
    @Test
    void testMultiplyNum() {
        myCalculator = new Calculator();
        assertEquals(20,myCalculator.MultiplyNum(4,6));
    }

    @DisplayName("Addition Test Check")
    @Test
    void testDivideNum() {
        myCalculator = new Calculator();
        assertEquals(5,myCalculator.DivideNum(10,2));
    }
}
