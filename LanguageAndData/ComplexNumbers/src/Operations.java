/**
 * This file is part of the Endava Graduates training program
 * Created by Calin Radu 20.07.2015
 */

//Class for operations over complex numbers
public class Operations {

    //Adds 2 complex numbers
    public ComplexNumber add(ComplexNumber a, ComplexNumber b) {
        ComplexNumber sum = new ComplexNumber(a.getRe() + b.getRe(), a.getIm() + b.getIm());
        return sum;
    }

    //Multiplies 2 complex numbers
    public ComplexNumber multiply(ComplexNumber a, ComplexNumber b) {

        float re;
        float im;

        re = a.getRe() * b.getRe() - a.getIm() * b.getIm();
        im = a.getRe() * b.getIm() + a.getIm() * b.getRe();
        return new ComplexNumber(re, im);
    }

}
