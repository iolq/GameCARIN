package com.company;

import java.util.Map;

public class BinaryAritmExpr implements Expression{
    private Expression left,right;
    private String op;
    public BinaryAritmExpr(Expression left,String op,Expression right){
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
        return 0;
    }

    @Override
    public void prettyPrint(StringBuilder s) {
        s.append("(");
        left.prettyPrint(s);
        s.append(op);
        right.prettyPrint(s);
        s.append(")");
    }
}
