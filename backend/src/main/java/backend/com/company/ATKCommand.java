package backend.com.company;

public class ATKCommand implements Statement{
     Statement direction;
     Cell antibody, virus;
     ATKCommand(Statement direction, Cell antibody, Cell virus){
         this.direction = direction;
         this.antibody = antibody;
         this.virus = virus;
     }

    @Override
    public void eval() {

    }
    @Override
    public Pair<Integer, Integer> evalPair() {
        return null;
    }

}
