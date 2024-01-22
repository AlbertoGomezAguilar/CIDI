import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FibonacciTest {

    @Test
    public void testcalcularFibonacci() {
        assertEquals(0, org.example.Fibonacci.testcalcularFibonacci(0));
        assertEquals(1, org.example.Fibonacci.testcalcularFibonacci(1));
        assertEquals(1, org.example.Fibonacci.testcalcularFibonacci(2));
        assertEquals(2, org.example.Fibonacci.testcalcularFibonacci(3));
        assertEquals(3, org.example.Fibonacci.testcalcularFibonacci(4));
        assertEquals(5, org.example.Fibonacci.testcalcularFibonacci(5));
    }

}