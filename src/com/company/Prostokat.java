package com.company;

import java.util.Objects;

public class Prostokat implements MoznaWyznaczycWielokrotnoscPrzekatnej, MoznaWyznaczycWysokosc {

    final int bok1, bok2;

    public Prostokat(int bok1, int bok2) {
        this.bok1 = bok1;
        this.bok2 = bok2;
    }
    @Override
    public double katNachylenia() {
        return 0;
    }
    @Override
    public double bok() {
        return 0;
    }

    @Override
    public double podstawa() {

        return 0;
    }

    @Override
    public double wielokrotnoscPrzekatnej(double v) {
        return 0;
    }

    @Override
    public double przekatna() {

        return 0;
    }

    @Override
    public double wysokosc() {
        return 0;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Prostokat)) return false;
        Prostokat prostokat = (Prostokat) o;
        return bok1 == prostokat.bok1 && bok2 == prostokat.bok2;
    }

    @Override
    public int hashCode() {
        return Objects.hash(bok1, bok2);
    }

    @Override
    public String toString() {
        return "Prostokat{" +
                "bok1=" + bok1 +
                ", bok2=" + bok2 +
                '}';
    }
}
