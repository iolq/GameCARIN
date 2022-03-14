package backend.com.company;

import java.util.Map;

public class BlockStatement implements Statement{
    Statement st;

    BlockStatement(Statement st){
        this.st = st;
    }

    @Override
    public void eval() {

    }
    @Override
    public Pair<Integer, Integer> evalPair() {
        return null;
    }

}
