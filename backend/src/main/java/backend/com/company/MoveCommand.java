package backend.com.company;

public class MoveCommand implements Statement{
    Statement direction;
    Cell unit;

    MoveCommand(Statement direction, Cell unit){
        this.direction = direction;
        this.unit = unit;
    }

    @Override
    public Pair<Integer, Integer> evalPair() {
        return null;
    }

    @Override
    public void eval() {

    }
}
