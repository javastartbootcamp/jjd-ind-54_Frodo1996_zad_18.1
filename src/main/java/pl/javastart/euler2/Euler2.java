package pl.javastart.euler2;

import java.util.List;

public class Euler2 {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        List<Integer> list = calculator.fibonacciSequence();
        System.out.println(list);
        int sumOfFibonacciSequence = calculator.sumOfFibonacciSequence(list);
        System.out.println("Suma parzystych elementów ciągu Fibonacciego," +
                " których wartość jest mniejsza od 4 milionów to " + sumOfFibonacciSequence);
    }
}
