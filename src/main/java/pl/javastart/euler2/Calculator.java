package pl.javastart.euler2;

import java.util.ArrayList;
import java.util.List;

public class Calculator {

    private static final int DESIRED_SEQUENCE_REPEATS = 33;
    private static final int ACCEPTED_SUM_LIMIT = 1_000_000;
    //1 milion, ponieważ każda kolejna wartość z ciągu liczbowego spowoduje pozyskanie sumy większej niż 4 miliony

    List<Integer> fibonacciSequence() {
        ArrayList<Integer> valuesFromSequence = new ArrayList<>();
        int firstValue = 0;
        int secondValue = 1;
        int thirdValue;
        for (int i = 1; i <= DESIRED_SEQUENCE_REPEATS; i++) {
            thirdValue = firstValue + secondValue;
            firstValue = secondValue;
            secondValue = thirdValue;
            if (firstValue % 2 == 0) {
                valuesFromSequence.add(firstValue);
            }
        }
        return valuesFromSequence;
    }

    int sumOfFibonacciSequence(List<Integer> valuesFromSequence) {
        int sum = 0;
        for (Integer integer : valuesFromSequence) {
            if (sum <= ACCEPTED_SUM_LIMIT) {
                sum += integer;
            }
        }
        return sum;
    }
}