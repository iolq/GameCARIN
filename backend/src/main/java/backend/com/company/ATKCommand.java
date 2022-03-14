package backend.com.company;

public class ATKCommand implements Statement{
     Statement direction;
     Cell antibody, virus;
     ATKCommand(Statement direction, Cell antibody){
         this.direction = direction;
         this.antibody = antibody;
     }

    @Override
    public void eval() {

    }
    @Override
    public Pair<Integer, Integer> evalPair() {
        return null;
    }

}
