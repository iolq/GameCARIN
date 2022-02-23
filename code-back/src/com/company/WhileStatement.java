package com.company;

import java.util.Map;

public class WhileStatement implements Statement{
    Expressions ex;
    Statement info;

    WhileStatement(Expressions ex, Statement info){
        this.ex = ex;
        this.info = info;
    }

    public void loop(){
        while (ex.number() > 0){
            info.eval();
        }
    }


    @Override
    public void eval() {

    }
}
