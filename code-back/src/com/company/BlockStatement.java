package com.company;

import java.util.Map;

public class BlockStatement implements Expressions{
    Expressions st;

    BlockStatement(Expressions st){
        this.st = st;
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
