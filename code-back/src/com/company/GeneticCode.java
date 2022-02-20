package com.company;

import java.util.HashMap;
import java.util.Map;

public class GeneticCode {
    ExTokenizer To;
    int result = 0;
    private Map<String,Integer> str = new HashMap();
    private Binary br;
    private Pair<String,Pair<String,String>> direct;

    GeneticCode(Pair<String,String> list){
        To = new ExTokenizer(list);
    }

    public void setDirect(Pair<String,Pair<String,String>> list){
        direct = list;
    }

    Expressions Program(){
        return  Statement();
    }

    Expressions Statement(){

        if(To.peek("{")){
            return BlockStatement();
        }else if(To.peek("if")){
            return IfStatement();
        }else if (To.peek("while")){
            return WhileStatement();
        } else{
            return Command();
        }
    }

    Expressions Command(){

        if(To.peek("move") || To.peek("atk")){
            return ActionCommand();
        }else{
            return AssignmentStatement();
        }

    }

    Expressions AssignmentStatement(){
        String Identify = To.peek();
        To.consume("=");
        Expressions Ex = Expression();
        return null;
    }

    Expressions ActionCommand(){

        if(To.peek("move")){
            return MoveCommand();
        }else if(To.peek("atk")){
            return AttackCommand();
        }
        return null;
    }

    Expressions MoveCommand(){
        Expressions move = Direction();
        return move;
    }

    Expressions AttackCommand(){
        Expressions Atk = Direction();
        return Atk;
    }

    Expressions Direction(){
        Move m = new Move();
        Pair<String, String> p = direct.snd;
        switch (direct.fst) {
            case "Up" -> m.moveUp(Integer.parseInt(p.snd));
            case "Down" -> m.moveDown(Integer.parseInt(p.snd));
            case "Left" -> m.moveLeft(Integer.parseInt(p.snd));
            case "Right" -> m.moveRight(Integer.parseInt(p.snd));
            case "UpRight" -> m.moveUpRight(Integer.parseInt(p.fst), Integer.parseInt(p.snd));
            case "UpLeft" -> m.moveUpLeft(Integer.parseInt(p.fst), Integer.parseInt(p.snd));
            case "DownRight" -> m.moveDownRight(Integer.parseInt(p.fst), Integer.parseInt(p.snd));
            case "DownLeft" -> m.moveDownLeft(Integer.parseInt(p.fst), Integer.parseInt(p.snd));
        }
        return null;
    }

    Expressions BlockStatement(){
        return null;
    }

    Expressions IfStatement(){

        To.consume("if");
        To.consume("(");
        Expressions Ex = Expression();
        To.consume(")");
        To.consume("then");
        Expressions TrueStatement = Statement();
        To.consume("else");
        if(To.peek("if")){
            IfStatement();
        }
        Expressions FalseStatement = Statement();

        return null;
    }

    Expressions WhileStatement(){
        To.consume("while");
        To.consume("(");
        Expressions Ex = Expression();
        To.consume(")");
        Expressions St = Statement();
        return null;
    }

    Expressions Expression(){
        Expressions term = Term();
        while(To.peek("+")||To.peek("-")){
            String op = To.consume();
            Expressions Term2 = Term();
            if(op.equals("+")){
                br = new Binary(term,"+",Term2);
                term = br;
            }else if(op.equals("-")){
                br = new Binary(term,"-",Term2);
                term = br;
            }
            result = br.eval(str);
        }
        return term;
    }

    Expressions Term(){
        Expressions fa = Factor();
        while(To.peek("*") || To.peek("/")||To.peek("%")){
            String op = To.consume();
            Expressions Fa2 = Factor();
            switch (op) {
                case "*":
                br = new Binary(fa,"*",Fa2);
                fa = br;
                    break;
                case "/":
                    if (Fa2 != null) {
                        br = new Binary(fa, "/", Fa2);
                        fa = br;
                    }
                    break;
                case "%":
                    if (Fa2 != null) {
                        br = new Binary(fa, "%", Fa2);
                        fa = br;
                    }
                    break;
            }
            result = br.eval(str);
        }

        return fa;
    }

    Expressions Factor(){
        Expressions po = Power();
        while (To.peek("^")){
            if(To.peek("^")){
                String op = To.consume();
                Expressions fa = Factor();
                br = new Binary(po, op, fa);
                po = br;
            }
            result = br.eval(str);
        }
        return po;
    }

    Expressions Power(){
        if(IsNumber(To.peek())){
            return new Number(Integer.parseInt(To.consume()));
        }else if(!IsNumber(To.peek())){
            // return identify
            return null;
        }else if(To.peek().equals("(") || To.peek().equals(")")) {
            To.consume("(");
            Expressions Ex = Expression();
            To.consume(")");
            return Ex;
        }else{
            Expressions se = SensorExpression();
            return se;
        }
    }

    Expressions SensorExpression(){
//        Expressions Di = Direction();
//        if(1 == 1){
//            //virus
//        }else if(1 == 1){
//            // antibody
//        }
        return null;
    }

    boolean IsNumber(String s) throws NumberFormatException{
        Integer.parseInt(s);
        return true;
    }

    public int getExr() {
        return Expression().eval(str);
    }
}
