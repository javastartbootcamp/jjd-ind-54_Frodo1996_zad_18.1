package pl.javastart.euler2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @Test
    public void shouldReturn0ForValue0() {
        // given
        int value = 0;
        // when
        int sumOfFibonacciSequence = calculator.fibonacciSequence(value);
        //then
        assertEquals(0, sumOfFibonacciSequence);
    }

    @Test
    public void shouldReturnSum10ForValue10() {
        // given
        int value = 10;
        // when
        int sumOfFibonacciSequence = calculator.fibonacciSequence(value);
        //then
        assertEquals(10, sumOfFibonacciSequence);
    }

    @Test
    public void shouldReturnSum44ForValue10() {
        // given
        int value = 34;
        // when
        int sumOfFibonacciSequence = calculator.fibonacciSequence(value);
        //then
        assertEquals(44, sumOfFibonacciSequence);
    }

    @Test
    public void shouldReturnSum188ForNotEvenValue65() {
        // given
        int value = 65;
        // when
        int sumOfFibonacciSequence = calculator.fibonacciSequence(value);
        //then
        assertEquals(188, sumOfFibonacciSequence);
    }

    @Test
    public void shouldReturnSum4613732ForValue4000000() {
        // given
        int value = 4000000;
        // when
        int sumOfFibonacciSequence = calculator.fibonacciSequence(value);
        //then
        assertEquals(4613732, sumOfFibonacciSequence);
    }
}