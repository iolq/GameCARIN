package com.company;


import java.util.Map;

public class Number implements Expressions {
    private int num;
    public Number(int num){
        this.num = num;
    }


    @Override
    public int eval(Map<String, Integer> binding) {
        return num;
    }
}
