package backend.com.company;

public class MoveCommand implements Statement{
    Statement direction;
    Cell unit;
    Pair<Integer,Integer> command = new Pair<>(0,0);

    MoveCommand(Statement direction, Cell unit){
        this.direction = direction;
        this.unit = unit;
        command = direction.evalPair();
    }

    @Override
    public Pair<Integer, Integer> evalPair() {
        return null;
    }

    @Override
    public void eval() {
        unit.moveTo(command.fst,command.snd);
    }
}
