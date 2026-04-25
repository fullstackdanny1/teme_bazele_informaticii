package com.tema5.ex2;

public class PunctColorat extends Punct
{
    private String c; // color code

    // din moment ce superclasa punct nu are un constructor implicit (no arg)
    // este necesara existenta unui constructor in subclasa care sa apeleze 
    // constructorul definit in clasa Punct
    //
    // Un exemplu de constructor pentru clasa PunctColorat

    public PunctColorat(int x, int y, String c)
    {
       super(x, y);
       this.c = c;
    }
}
