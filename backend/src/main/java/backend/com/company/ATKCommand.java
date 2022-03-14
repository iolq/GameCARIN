package backend.com.company;

public class ATKCommand implements Statement{
     Statement direction;
     Unit unit;
     ATKCommand(Statement direction, Unit unit){
         this.direction = direction;
         this.unit = unit;
     }

    @Override
    public void eval() {

    }
}
