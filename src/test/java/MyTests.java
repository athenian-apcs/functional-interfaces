import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyTests {
    @Test
    public void testPrime() {
        assertEquals(false, MyMain.isPrime(100), "100 should not be prime.");
        assertEquals(true, MyMain.isPrime(97), "97 should be prime.");
        assertEquals(false, MyMain.isPrime(24), "24 should not be prime.");
        assertEquals(true, MyMain.isPrime(23), "23 should be prime.");
        assertEquals(true, MyMain.isPrime(2), "2 should be prime.");
        assertEquals(false, MyMain.isPrime(15), "15 should not be prime.");
        assertEquals(true, MyMain.isPrime(7), "7 should be prime.");
    }
    @Test
    public void testGCD() {
        assertEquals(1, MyMain.greatestCommonDivisor(1, 16), "1 should be the greatest common divisor of 1 and 16.");
        assertEquals(4, MyMain.greatestCommonDivisor(8, 12), "4 should be the greatest common divisor of 8 and 12.");
        assertEquals(3, MyMain.greatestCommonDivisor(45, 96), "3 should be the greatest common divisor of 45 and 96.");
        assertEquals(21, MyMain.greatestCommonDivisor(63, 84), "21 should be the greatest common divisor of 63 and 84..");
        assertEquals(1, MyMain.greatestCommonDivisor(13, 44), "1 should be the greatest common divisor of 13 and 44..");
    }
}
