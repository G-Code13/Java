import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class MathTest {
    @Test
    void testAdd() {
        Math calculator = new Math();
        assertEquals(4, calculator.add(2, 2));
    }

    @Test
    void testDivide() {
        var calculator = new Math();
        assertEquals(1, calculator.divide(2, 2));
    }

    @Test
    void testMultiply() {
        var calculator = new Math();
        assertEquals(6, calculator.multiply(3, 2));
    }

    @Test
    void testSubtract() {
        Math calculator = new Math();
        assertEquals(5, calculator.subtract(7, 2));

    }
}
