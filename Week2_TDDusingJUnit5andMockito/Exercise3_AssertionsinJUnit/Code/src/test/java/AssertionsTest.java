import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AssertionsTest {

    @Test
    public void testAssertions() {
        // 1. Check equality
        assertEquals(5, 2 + 3, "2 + 3 should equal 5");
        assertArrayEquals(new int[]{1, 2}, new int[]{1, 2});
        assertThrows(ArithmeticException.class, () -> {
            int x = 1 / 0;
        });
        assertAll(
                () -> assertTrue(10 > 5),
                () -> assertNotNull("JUnit")
        );

        // 2. Check true condition
        assertTrue(5 > 3, "5 is greater than 3");

        // 3. Check false condition
        assertFalse(5 < 3, "5 is not less than 3");

        // 4. Check for null
        assertNull(null, "Expected value to be null");

        // 5. Check for not null
        assertNotNull(new Object(), "Expected non-null object");
    }
}
