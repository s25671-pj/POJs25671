package com.company;

public class Kwadrat extends Prostokat implements MoznaWyznaczycPrzekatna{

    public Kwadrat(int bok1) {
        super(bok1, bok1);
    }

    public Kwadrat(int bok1, int bok2) {

        super(bok1, bok2);
    }

    @Override
    public String toString() {
        return "Kwadrat{}";
    }
}
