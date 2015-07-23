/**
 * This file is part of the Endava Graduates training program
 * Created by Calin Radu 20.07.2015
 */

//Class for complex numbers representation
public class ComplexNumber {

    private float re;
    private float im;

    ComplexNumber(float re, float im) {
        this.re = re;
        this.im = im;
    }

    public float getRe() {
        return re;
    }
    public float getIm() {
        return im;
    }
    public String toString() {
        return re + " + " + im + "i";
    }

}
