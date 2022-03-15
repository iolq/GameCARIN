package backend.com.company;

import java.util.*;

public class GeneticCode {
    ExTokenizer To;
    int result = 0;
    private Map<String,Integer> str = new HashMap();
    private Binary br;
    private final String[] list = {"left", "right", "up", "down", "UpLeft", "UpRight", "DownLeft", "DownRight"};
    private final Set<String> direction = new HashSet<>(List.of(list));
    private Cell antibody, virus;

    public GeneticCode(Cell antibody,Cell virus,String str){
        this.antibody = antibody;
        this.virus = virus;
        To = new ExTokenizer(str);
    }

    public GeneticCode(Cell antibody,String str){
        this.antibody = antibody;
        To = new ExTokenizer(str);
    }

    // Program = Statement+
//    Statement Program(){
//        return  Statement();
//    }

    // Statement = Command | BlockStatement | IfStatement | WhileStatement
    Statement Statement(){

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

    // Command = AssignmentStatement | ActionCommand
    Statement Command(){

        if(direction.contains(To.peek()) || To.peek("atk")){
            return ActionCommand();
        }else{
            return AssignmentStatement();
        }

    }

    // AssignmentStatement = <identifier> = Expression
    Statement AssignmentStatement(){
        String Identify = To.peek();
        To.consume("=");
        Expressions Ex = Expression();
        return null;
    }

    // ActionCommand = MoveCommand | AttackCommand
    Statement ActionCommand(){

        if(direction.contains(To.peek())){
            return MoveCommand();
        }else if(To.peek("atk")){
            return AttackCommand();
        }
        return null;
    }

    // MoveCommand = move Direction
    Statement MoveCommand(){
        return new MoveCommand(Direction(), antibody);

    }

    // AttackCommand = shoot Direction
    Statement AttackCommand(){
        To.consume();
        return new ATKCommand(To, antibody, virus);
    }

    // Direction = left | right | up | down | upleft | upright | downleft | downright
    Statement Direction(){

        if(direction.contains(To.peek())){
            return new Direction(To.peek());
        }
        return null;
    }

    // BlockStatement = { Statement* }
    Statement BlockStatement(){
        To.consume();
        return new BlockStatement(Statement());
    }


    // IfStatement = if ( Expression ) then Statement else Statement
    Statement IfStatement(){

        To.consume("if");
        To.consume("(");
        Expressions Ex = Expression();
        To.consume(")");
        To.consume("then");
        Statement TrueStatement = Statement();
        To.consume("else");
        if(To.peek("if")){
            IfStatement();
        }
        Statement FalseStatement = Statement();
        return  new IfStatement(Ex,TrueStatement,FalseStatement);
    }

    // WhileStatement = while ( Expression ) Statement
    Statement WhileStatement(){
        To.consume("while");
        To.consume("(");
        Expressions Ex = Expression();
        To.consume(")");
        Statement St = Statement();
        return new WhileStatement(Ex, St);
    }

    // Expression = Expression + Term | Expression - Term | Term
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


    // Term = Term * Factor | Term / Factor | Term % Factor | Factor
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

    // Factor = Power ^ Factor | Power
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

    // Power = <number> | <identifier> | ( Expression ) | SensorExpression
    Expressions Power(){
        if(IsNumber(To.peek())){
            return new Number(Integer.parseInt(To.consume()));
        }else if(To.peek().equals("(") || To.peek().equals(")")){
            To.consume("(");
            Expressions Ex = Expression();
            To.consume(")");
            return Ex;
        }else if(!IsNumber(To.peek())) {
            // return identify
            return null;
        }else{
            Expressions se = SensorExpression();
            return se;
        }
    }

    // SensorExpression = virus | antibody | nearby Direction
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
        if(s == null || s.equals(""))
            return false;
        try {
            int a = Integer.parseInt(s);
        }
        catch (NumberFormatException e)
        {
            return false;
        }
        return true;
    }

    public int getExr() {
        return Expression().eval(str);
    }

    public String test(){
        return AttackCommand().toString();
    }

    public void call(){
        Statement();
    }
}
