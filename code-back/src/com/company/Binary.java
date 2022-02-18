package com.company;

import java.util.Map;

public class Binary implements Expressions{
    private Expressions left,right;
    private String op;
    public Binary(Expressions left,String op,Expressions right){
        this.left = left; this.op = op; this.right = right;
    }

    @Override
    public int eval(Map<String, Integer> binding) {
        int left_value = left.eval(binding);
        int right_value = right.eval(binding);
        if(op.equals("+")) {
            return left_value + right_value;
        }
        if(op.equals("-")){
            return left_value - right_value;
        }
        if(op.equals("*")){
            return left_value * right_value;
        }
        if(op.equals("/")){
            return left_value / right_value;
        }
        if(op.equals("%")){
            return left_value % right_value;
        }
        if(op.equals("^")){
            return (int) Math.pow(left_value,right_value);
        }
        return 0;
    }
}
