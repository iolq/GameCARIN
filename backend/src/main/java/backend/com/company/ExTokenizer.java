package backend.com.company;

import java.util.regex.Pattern;

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
                s.append(c);
                position++;
                for(;position<src.length()
                        &&(Character.isDigit(src.charAt(position)) || isCharacter(src.charAt(position)));position++){  //after first character can be a-zA-z0-9_
                    s.append(src.charAt(position));
                }
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
        return Pattern.matches("[a-zA-z]",new StringBuilder(1).append(c));
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
