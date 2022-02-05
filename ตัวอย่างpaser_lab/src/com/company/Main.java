package com.company;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;



public abstract class Main{
    /**
     * effect : Calculate 1+2-3*4/5%6...
     * @param input : String line of your question
     * @return : String Question + Answer
     */
    public static String Calculate(String input) throws SyntaxError {
        Iterator
        for(char s:input.toCharArray()){
            if((int)s >= 58 && (int) s <= 126 || (int) s == 46){
                throw new SyntaxError();
            }
        }

        //InString str1 = new InString(input);
        //int res = str1.parseE();
        //ExpressionParser obj = new ExpressionParser(input);
        StringBuilder text = new StringBuilder();
        //obj.getExr().prettyPrint(text);
        //String str = text.toString();

        //ExpressionParser obj2 = new ExpressionParser(input);
        //int str2 = obj2.Evaluate();

        //Factory
        //ArithExprFactory cfc = new ArithExprFactory();
        //ExpressionParser php = cfc.newArithExpr(input);
        //php.getExr().prettyPrint(text);
        //ExpressionParser www = cfc.newArithExpr(input);
        //int str1 = www.Evaluate();

        //singleton
        ArithExprFactory ama = ArithExprFactory.instance();
        ExpressionParser parse1 = ama.newArithExpr(input);
        parse1.getExr().prettyPrint(text);
        ExpressionParser parse2 = ama.newArithExpr(input);
        int str3 = parse2.Evaluate();
        //String[] str = input.split("[0-9]+");
        //String[] strNum = input.split("[*/%+-]");
        //int results = Integer.parseInt(strNum[0]);
        //for(int i=1;i<strNum.length;i++){
        //    if(str[i].equals("+")){
        //        results += Integer.parseInt(strNum[i]);
        //    }else if(str[i].equals("-")){
        //        results -= Integer.parseInt(strNum[i]);
        //    }else if(str[i].equals("*")){
        //        results *= Integer.parseInt(strNum[i]);
        //    }else if(str[i].equals("/")){
        //        results /= Integer.parseInt(strNum[i]);
        //    }else if(str[i].equals("%")){
        //        results %= Integer.parseInt(strNum[i]);
        //    }
        //}

        //factory
        //String result = text.toString() + " = "+ str1;

        //singleton
        String result = text.toString() + " = " + str3;
        return result;
    }

    /**
     * effect : read a file
     */
    public static void InputFile(){
        Path file = Paths.get("input.txt");
        List<String> list = new LinkedList<>();
        Charset charset = Charset.forName("US-Ascii");
        try (BufferedReader reader = Files.newBufferedReader(file,charset)){
            String line = null;
            while((line = reader.readLine()) != null){
                list.add(Calculate(line));
            }
            OutputFile(list);
        }catch(IOException x){
            System.err.format("IOException: %s%n",x);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * effect : Write a file by text
     * @param mylist : String want to write on file
     */
    public static void OutputFile(List<String> mylist){
        Path file = Paths.get("output.txt");
        Object[] Array = mylist.toArray();
        Charset charset = Charset.forName("US-Ascii");
        try(BufferedWriter writer = Files.newBufferedWriter(file,charset)){
            for(int loop=0;loop<Array.length;loop++){
                writer.write((String) Array[loop]);
                writer.newLine();
            }
            writer.close();
        }catch (IOException x){
            System.err.format("IOException: %s%n",x);
        }
    }
/*
    boolean peek(String s) throws SyntaxError {
        return peek().equals(s);
    }

    void consume(String s) throws SyntaxError {
        if(peek(s)){
            consume();
        }else{
            throw new SyntaxError();
        }
    }

    int parseE() throws SyntaxError{
        int val = parseT();
        while(peek("+")){
            consume();
            val = val + parseT();
        }
        while(peek("-")){
            consume();
            val = val - parseT();
        }
        return val;
    }

    int parseT() throws SyntaxError{
        int val = parseF();
        while(peek("*")){
            consume();
            val = val*parseF();
        }
        while(peek("/")){
            consume();
            val = val/parseF();
        }
        while(peek("%")){
            consume();
            val = val%parseF();
        }
        return val;
    }

    int parseF() throws SyntaxError{
        if(IsNumber(peek())){
            return Integer.parseInt(consume());
        }else{
            consume("(");
            int val = parseE();
            consume(")");
            return val;
        }
    }

    boolean IsNumber(String s){
        if(s.equals("[0-9]")){
            return true;
        }else{
            return false;
        }
    }
*/
    public static void main(String[] args) {
	// write your code here
        //for(int loop= 0;loop<100000;loop++){
            InputFile();
        //}
        //System.out.println(addSpaces(""));
    }
}
