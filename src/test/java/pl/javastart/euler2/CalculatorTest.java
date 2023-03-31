package pl.javastart.euler2;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.mockito.Mock;

import java.util.List;

import static org.junit.Assert.*;

public class CalculatorTest {

    @Mock
    private Calculator calculator;
    private static final int SUM_LIMIT = 4_000_000;
    private int sum;

    @BeforeEach
    void init() {
        calculator = new Calculator();
        List<Integer> list = calculator.fibonacciSequence();
        sum = calculator.sumOfFibonacciSequence(list);
    }

    @Test
    public void sumShouldNotBeNull() {
        // given
        // when
        //then
        assertNotEquals("Suma ciągu fibonacciego nie jest obliczana prawidłowo", 0, sum);
    }

    @Test
    public void shouldReturnSumLowerThan4Millions() {
        // given
        // when
        //then
        assertTrue("Suma jest większa niż dopuszczalny limit", sum < SUM_LIMIT);
    }

    @Test
    public void shouldReturnEvenSum() {
        // given
        // when
        //then
        assertEquals("Suma nie jest parzysta", 0, sum % 2);
    }
}