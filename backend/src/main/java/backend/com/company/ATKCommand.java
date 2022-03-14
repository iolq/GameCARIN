package backend.com.company;

public class ATKCommand implements Statement{
     Statement direction;
     Cell antibody, virus;
     ExTokenizer To;
     String type;
     ATKCommand(ExTokenizer To, Cell antibody, Cell virus){
        this.To = To;
        this.antibody = antibody;
        this.virus = virus;
     }

    @Override
    public void eval() {
        To.consume("(");
        type = To.consume();
        To.consume(")");
        if(type.contains("A")){
            virus.dmg(antibody.ATK());
        }else if(type.contains("V")){
            antibody.dmg(virus.ATK());
        }
    }

    @Override
    public Pair<Integer, Integer> evalPair() {
        return null;
    }

}
