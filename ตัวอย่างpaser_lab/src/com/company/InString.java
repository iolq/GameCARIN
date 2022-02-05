package com.company;


import java.util.Scanner;
import java.util.regex.Pattern;

public class InString implements Tokenizer{
    String input1;
    InString(String s){
        this.input1 = s.toString();
    }
    @Override
    public String peek() {
        String str = "";
        Scanner scanne = new Scanner(input1);
        if(scanne.hasNext()){
            str = scanne.next();
        }
        scanne.close();
        return str;
    }

    @Override
    public String consume() {
        String str = "";
        Scanner scanne = new Scanner(input1);
        if(scanne.hasNext()){
            str = scanne.next();
        }
        scanne.close();
        try{
            input1 = input1.replaceFirst(Pattern.quote(str),"");
        }catch(NullPointerException s){
        }
        return str;
    }

    boolean peek(String s) {

        return peek().equals(s);
    }

    void consume(String s) throws SyntaxError {
        if(peek(s)){
            consume();
        }else{
            throw new SyntaxError();
        }
    }

    //E -> E + T|E - T|T
    int parseE() throws SyntaxError {
        int val = parseT();
        while(peek("+")||peek("-")){
            String op = consume();
            int val2 = parseT();
            if(op.equals("+")){
                val = val+val2;
            }else if(op.equals("-")){
                val = val-val2;
            }
        }
        return val;
    }

    //T -> T * F|T / F|T % F|F
    int parseT() throws SyntaxError {
        int val = parseF();
        while(peek("*") || peek("/")||peek("%")){
            String op = consume();
            int val2 = parseF();
            if(op.equals("*")){
                val = val*val2;
            }else if(op.equals("/")){
                if(val2 != 0){
                    val = val/val2;
                }else{
                    throw new SyntaxError();
                }
            }else if(op.equals("%")){
                if(val2 != 0){
                    val = val%val2;
                }else{
                    throw new SyntaxError();
                }
            }
        }
        return val;
    }

    // F -> n | (E)
    int parseF() throws SyntaxError {
        try{
            IsNumber(peek());
            return Integer.parseInt(consume());
        }catch (NumberFormatException s){
            consume("(");
            int val = parseE();
            consume(")");
            return val;
        }
    }

    boolean IsNumber(String s) throws NumberFormatException{
        Integer.parseInt(s);
        return true;
    }


}
