package pl.javastart.euler2;

public class Calculator {

    int fibonacciSequence(int maxSumOfEvenNumbersInFibonacciSequence) {
        int sum = 0;
        int firstValue = 0;
        int secondValue = 1;
        int thirdValue;
        do {
            thirdValue = firstValue + secondValue;
            firstValue = secondValue;
            secondValue = thirdValue;
            if (firstValue % 2 == 0) {
                sum += firstValue;
            }
        } while (sum < maxSumOfEvenNumbersInFibonacciSequence);
        return sum;
    }
}