package com.company;

import java.util.Map;

public class WhileStatement implements Expressions{
    Expressions ex;
    Expressions info;

    WhileStatement(Expressions ex, Expressions info){
        this.ex = ex;
        this.info = info;
    }

    public void loop(){
        while (ex.number() > 0){
            info.number();
        }
    }

    @Override
    public int eval(Map<String, Integer> binding) {
        return 0;
    }

    @Override
    public int number() {
        return 0;
    }
}
