import java.util.ArrayList;
import java.util.List;
import java.util.function.DoubleConsumer;
import java.util.function.IntUnaryOperator;

public class MyMain {
    // READ THE README IF CONFUSED

    /**
     * Write an IntUnaryOperator (a functional interface representing an operation on a single int that returns an int)
     * which gives the value of that integer + 1.
     * @return the IntUnaryOperator which returns the value of the argument increased by one.
     */
    public static IntUnaryOperator increment () {
        return new IntUnaryOperator() {
            @Override
            public int applyAsInt(int operand) {
                return 0;
            }
        };
    }

    /**
     * Very similar to the above problem, but this one is set up to use a lambda. Notice how all the key information
     * from above is repeated.
     * @return the IntUnaryOperator which returns the value of the argument decreased by one.
     */
    public static IntUnaryOperator decrement () {
        return (int operand) -> {/*YOUR CODE HERE*/};
    }

    /**
     * Now, you're on your own. Return a DoubleConsumer (a function which accepts a double and doesn't return anything)
     * which adds the double to a given list.
     * @param list A list which the DoubleConsumer adds to.
     * @return The DoubleConsumer which adds its arguments to the List
     */
    public static DoubleConsumer addToList (List<Double> list) {
        return null;
    }
}
