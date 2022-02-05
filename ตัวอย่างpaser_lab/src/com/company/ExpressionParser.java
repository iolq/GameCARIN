package com.company;

import java.util.HashMap;
import java.util.Map;
public class ExpressionParser {
    private ExpressTokenizer tkz;
    private int result = 0;
    private BinaryAritmExpr br;
    private Map<String,Integer> str = new HashMap();
    public ExpressionParser(String src){
        this.tkz = new ExpressTokenizer(src);
    }

    Expression parseE() throws SyntaxError {
        Expression val = parseT();
        while(tkz.peek("+")||tkz.peek("-")){
            String op = tkz.consume();
            Expression val2 = parseT();
            if(op.equals("+")){
                br = new BinaryAritmExpr(val,"+",val2);
                val = br;
            }else if(op.equals("-")){
                br = new BinaryAritmExpr(val,"-",val2);
                val = br;
            }
            result = br.eval(str);
        }
        return val;
    }

    //T -> T * F|T / F|T % F|F
    Expression parseT() throws SyntaxError {
        Expression val = parseF();
        while(tkz.peek("*") || tkz.peek("/")||tkz.peek("%")){
            String op = tkz.consume();
            Expression val2 = parseF();
            if(op.equals("*")){
                br = new BinaryAritmExpr(val,"*",val2);
                val = br;
            }else if(op.equals("/")){
                if(val2 != null){
                    br = new BinaryAritmExpr(val,"/",val2);
                    val = br;
                }else{
                    throw new SyntaxError();
                }
            }else if(op.equals("%")){
                if(val2 != null){
                    br = new BinaryAritmExpr(val,"%",val2);
                    val = br;
                }else{
                    throw new SyntaxError();
                }
            }
            result = br.eval(str);
        }
        return val;
    }

    // F -> n | (E)
    Expression parseF() throws SyntaxError {
        try{
            IsNumber(tkz.peek());
             IntLit val2 = new IntLit(Integer.parseInt(tkz.consume()));
            return val2;
        }catch (NumberFormatException s){
            tkz.consume("(");
            Expression val = parseE();
            tkz.consume(")");
            return val;
        }
    }

    boolean IsNumber(String s) throws NumberFormatException{
        Integer.parseInt(s);
        return true;
    }

    public Expression getExr() throws SyntaxError {
        return parseE();
    }
    public int Evaluate() throws SyntaxError {
        return parseE().eval(str);
    }
}
