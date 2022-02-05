package com.company;

import java.util.Map;

public class Variable implements Expression{
    private String name;
    public Variable(String name){
        this.name = name;

    }

    @Override
    public int eval(Map<String, Integer> binding) {
        if(binding.containsKey(name)){
            return binding.get(name);
        }
        return 0;
    }

    @Override
    public void prettyPrint(StringBuilder s) {
        s.append(name);
    }
}
