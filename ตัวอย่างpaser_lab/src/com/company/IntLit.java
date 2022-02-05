package com.company;

import java.util.Map;

public class IntLit implements Expression {
    private int val;
    public IntLit(int val){
        this.val = val;
    }
    @Override
    public int eval(Map<String, Integer> binding) {
        return val;
    }

    @Override
    public void prettyPrint(StringBuilder s) {
        s.append(val);
    }
}
