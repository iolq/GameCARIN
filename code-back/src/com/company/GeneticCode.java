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
        Expressions st = Statement();
        return  st;
    }

    Expressions Statement(){

        if(To.peek().equals("Command")){
            Expressions co = Command();
            return co;
        }else if(To.peek().equals("BlockStatement")){
            Expressions Blo = BlockStatement();
            return Blo;
        }else if(To.peek().equals("IfStatement")){
            Expressions If = IfStatement();
            return If;
        }else{
            Expressions wh = WhileStatement();
            return wh;
        }
    }

    Expressions Command(){

        if(To.peek().equals("AssignmentStatement")){
            Expressions As = AssignmentStatement();
            return As;
        }else{
            Expressions Ac = ActionCommand();
            return Ac;
        }

    }

    Expressions AssignmentStatement(){
        Expressions Ex = Expression();
        int va;
        return Ex;
    }

    Expressions ActionCommand(){

        if(To.peek().equals("Move")){
            Expressions mo = MoveCommand();
            return mo;
        }else if(To.peek().equals("ATK")){
            Expressions Atk = AttackCommand();
            return Atk;
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
        Expressions Ex = Expression();
        Expressions TrueStatement;
        Expressions FalseStatement;
        return null;
    }

    Expressions WhileStatement(){
        Expressions Ex = Expression();
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
        }else if(1 == 1){
            // return identify
            return null;
        }else if(1 == 1) {
            To.consume("(");
            Expressions Ex = Expression();
            To.consume(")");
            return Ex;
        }
//        }else{
//            Expressions se = SensorExpression();
//            return se;
//        }

        return null;
    }

    Expressions SensorExpression(){
        Expressions Di = Direction();
        if(1 == 1){
            //virus
        }else if(1 == 1){
            // antibody
        }
        return Di;
    }

    boolean IsNumber(String s) throws NumberFormatException{
        Integer.parseInt(s);
        return true;
    }

    public int getExr() {

        return Expression().eval(str);
    }
}
