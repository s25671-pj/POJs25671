package com.company;

import java.util.Objects;

public class Buzka implements PrzedstawiaEmocje, Rysowalny {

    char c;

    public Buzka(char c) {

        this.c = c;

    }

    public Buzka() {

    }


    @Override
    public boolean czySieUsmiecha() {

            if (true) {
                System.out.println(":-)");

                return true;

            }else{
            System.out.println(":-(");

            return false;
            }
    }

    @Override
    public void przestanSieUsmiechac() {

        //new Buzka(c) = ":-(";

    }

    @Override
    public void draw() {

    }

    @Override
    public void draw(int i) {

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Buzka)) return false;
        Buzka buzka = (Buzka) o;
        return c == buzka.c;
    }

    @Override
    public String toString() {
        return "Buzka{" +
                "c=" + c +
                '}';
    }
}