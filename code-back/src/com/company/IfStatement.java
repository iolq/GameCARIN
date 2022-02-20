package com.company;

import java.util.Map;

public class IfStatement implements Expressions{
    private Expressions check;
    private Expressions True;
    private Expressions False;

    public IfStatement(Expressions ch, Expressions t){
        check = ch;
        True = t;
    }

    public IfStatement(Expressions ch, Expressions t, Expressions f){
        this(ch,t);
        False = f;
    }


    @Override
    public int eval(Map<String, Integer> binding) {
        return 0;
    }
}
