package backend.com.company;

import java.util.Map;

public class WhileStatement implements Statement{
    Expressions ex;
    Statement info;
    int count = 0;

    WhileStatement(Expressions ex, Statement info){
        this.ex = ex;
        count = ex.number();
        this.info = info;
    }

    public void loop(){
        while (count > 0){
            info.eval();
            count--;
        }
    }


    @Override
    public void eval() {

    }
    
    @Override
    public Pair<Integer, Integer> evalPair() {
        return null;
    }
}
