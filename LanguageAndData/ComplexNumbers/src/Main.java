/**
 * This file is part of the Endava Graduates training program
 * Created by Calin Radu 20.07.2015
 */

/**
 * Class for testing the functionality of complex numbers
 */
public class Main {
    public static void main(String[] args) {
        ComplexNumber a = new ComplexNumber(2, 3);
        ComplexNumber b = new ComplexNumber(4, 5);

        Operations op = new Operations();

        ComplexNumber sum = op.add(a, b);
        ComplexNumber multiply = op.multiply(a, b);

        System.out.println("(" + a + ") + (" + b + ") = " + sum);
        System.out.println("(" + a + ") * (" + b + ") = " + multiply);
    }
}
