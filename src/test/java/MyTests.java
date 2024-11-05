import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.DoubleConsumer;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class MyTests {
    @Test
    public void testIncrement() {
        assertEquals(2, MyMain.increment().applyAsInt(1));
        assertEquals(4, MyMain.increment().applyAsInt(3));
        assertEquals(-100, MyMain.increment().applyAsInt(-101));
        assertEquals(92384, MyMain.increment().applyAsInt(92383));
    }

    @Test
    public void testDecrement() {
        assertEquals(2, MyMain.decrement().applyAsInt(3));
        assertEquals(4, MyMain.decrement().applyAsInt(5));
        assertEquals(-100, MyMain.decrement().applyAsInt(-99));
        assertEquals(92384, MyMain.decrement().applyAsInt(92385));
    }

    @Test
    public void testAddToList() {
        List<Double> list = new ArrayList<>();
        DoubleConsumer adder = MyMain.addToList(list);
        assertNotNull(adder);
        adder.accept(3.9);
        adder.accept(2.14);
        adder.accept(100);
        adder.accept(-2);
        assertEquals(Arrays.toString(new double[]{3.9, 2.14, 100, -2}), Arrays.toString(list.toArray()));
    }
}
