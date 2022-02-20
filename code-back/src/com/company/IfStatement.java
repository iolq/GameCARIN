package com.company;

public class IfStatement implements Statement{
    private Expressions check;
    private Statement True;
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

    }
}
