package pl.javastart.euler2;

public class Euler2 {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int example1 = calculator.fibonacciSequence(10);
        int example2 = calculator.fibonacciSequence(34);
        int example3 = calculator.fibonacciSequence(4000000);

        System.out.println("Suma parzystych elementów ciągu Fibonacciego," +
                " których wartość jest mniejsza od 10 to " + example1);
        System.out.println("Suma parzystych elementów ciągu Fibonacciego," +
                " których wartość jest mniejsza od 34 to " + example2);
        System.out.println("Suma parzystych elementów ciągu Fibonacciego," +
                " których wartość jest mniejsza od 4 milionów to " + example3);
    }
}
