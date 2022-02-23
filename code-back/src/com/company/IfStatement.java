package com.company;

import java.util.Map;

public class IfStatement implements Statement{
    private final Expressions check;
    private final Statement True;
    private Statement False;

    public IfStatement(Expressions ch, Statement t){
        check = ch;
        True = t;
    }

    public IfStatement(Expressions ch, Statement t, Statement f){
        this(ch,t);
        False = f;
    }

    @Override
    public void eval() {
        if(check.number() != 0){
            True.eval();
        }else{
            False.eval();
        }
    }
}
