import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestSquareRootApplication {
    @Test
    void additionSqrt() {
        assertEquals(Math.sqrt(4), SquareRoot.sqrtRoot(4));
    }
    @Test
    void additionSqrtZero() {
        assertEquals(Math.sqrt(0), SquareRoot.sqrtRoot(0),0.1);
    }
    @Test
    void additionSqrtUnderZero() {
        assertEquals(Math.sqrt(-10), SquareRoot.sqrtRoot(-10),0.1);
    }

}
