package com.company;

import java.util.Map;

public class IfStatement implements Expressions{
    private final Expressions check;
    private final Expressions True;
    private Expressions False;

    public IfStatement(Expressions ch, Expressions t){
        check = ch;
        True = t;
    }

    public IfStatement(Expressions ch, IfStatement t, IfStatement f){
        this(ch,t);
        False = f;
    }


    @Override
    public int eval(Map<String, Integer> binding) {
        return 0;
    }

    @Override
    public int number() {
        if(check.number() != 0){
            True.number();
        }else{
            False.number();
        }
        return 0;
    }
}
