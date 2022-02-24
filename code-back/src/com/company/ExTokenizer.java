package com.company;

import java.util.Iterator;
import java.util.LinkedList;

public class ExTokenizer implements Tokenizer{
    private String src;
    private String next;
    private int position;

    ExTokenizer(String ac){
        src = ac;
        computeNext();
    }

    private void computeNext() {
        StringBuilder s = new StringBuilder();
        //ตัดช่องว่าง
        while(position<src.length() && isSpace(src.charAt(position))) position++;

        if(position<src.length()){
            char c = src.charAt(position);
            if(Character.isDigit(c)){
                s.append(c);
                for(position++;position<src.length() && Character.isDigit(src.charAt(position));position++){
                    s.append(src.charAt(position));
                }
            }else if(isCharacter(c)){
                System.out.println("SyntaxError");
            }else if(c=='+'||c=='-'||c=='('||c==')'||c=='*'||c=='/'||c=='%'||c=='^'){
                s.append(c);position++;
            }else{
                System.out.println("SyntaxError");
            }
        }
        next = s.toString();
    }

    private boolean isSpace(char c){
        if(c == ' '){
            return true;
        }
        return false;
    }

    private boolean isCharacter(char c){
        if((int) c <= 65 && (int) c >= 122){
            return true;
        }
        return false;
    }


    @Override
    public String peek() {
        return next;
    }

    @Override
    public String consume() {
        String result = next;
        computeNext();
        return result;
    }



    boolean peek(String s) {
        if(s == null){
            return false;
        }
        return peek().equals(s);
    }

    void consume(String s) {
        if(peek(s)){
            consume();
        }
    }
}
