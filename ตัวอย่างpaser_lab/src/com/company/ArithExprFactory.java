package com.company;

public class ArithExprFactory {
    //factory
    public ExpressionParser newArithExpr(String input){

        return new ExpressionParser(input);
    }

    //public ArithExprFactory(){}


    //singleton
    public static ArithExprFactory instance;

    private ArithExprFactory(){}

    public static ArithExprFactory instance(){
        if(instance == null){
            instance = new ArithExprFactory();
        }
        return instance;
    }
}
