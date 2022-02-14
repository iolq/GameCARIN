import java.beans.Expression;

public class GeneticCode {
    Expression Program(){
        Expression st = Statement();
        return  st;
    }

    Expression Statement(){
        Expression wh = WhileStatement();
        int i = 1;
        if(i == 1){
            Expression co = Command();
            return co;
        }else if(i == 2){
            Expression Blo = BlockStatement();
            return Blo;
        }else if(i == 3){
            Expression If = IfStatement();
            return If;
        }
        return wh;
    }

    Expression Command(){
        Expression Ac = ActionCommand();
        int i = 0;

        if(i == 0){
            Expression As = AssignmentStatement();
            return As;
        }

        return null;
    }

    Expression AssignmentStatement(){
        Expression Ex = Expression();
        return Ex;
    }

    Expression ActionCommand(){
        Expression Atk = AttackCommand();

        int i = 0;
        if(i == 0){
            Expression mo = MoveCommand();
        }
        return Atk;
    }

    Expression MoveCommand(){
        Expression move = Direction();
        return move;
    }

    Expression AttackCommand(){
        Expression Atk = Direction();
        return Atk;
    }

    Expression Direction(){
        //left down right up
        return null;
    }

    Expression BlockStatement(){
        return null;
    }

    Expression IfStatement(){
        Expression Ex = Expression();
        if(Ex == Ex){
            Expression st = Statement();
        }else{
            Expression st = Statement();
        }
        return null;
    }

    Expression WhileStatement(){
        Expression Ex = Expression();
        while(Ex == Ex){
            Expression St = Statement();
            break;
        }
        return null;
    }

    Expression Expression(){
        Expression term = Term();
        if(1 == 1){
            Expression Ex = Expression();
            // Ex + term
        }else if(2 == 2){
            Expression Ex = Expression();
            // Ex - term
        }
        return term;
    }

    Expression Term(){
        Expression fa = Factor();

        if(1 == 1){
            Expression t = Term();
            // t * fa
        }else if(1 == 1){
            Expression t = Term();
            // t / fa
        }else if(1 == 1){
            Expression t = Term();
            // t % fa
        }
        return fa;
    }

    Expression Factor(){
        Expression po = Power();
        if(1 == 1){
            Expression fa = Factor();
            // po ^ fa
        }
        return Power();
    }

    Expression Power(){
        Expression se = SensorExpression();
        if(1 == 1){
            int num = 0;
            // return int
            return null;
        }else if(1 == 1){
            // return identify
            return null;
        }else if(1 == 1){
            Expression Ex = Expression();
            return Ex;
        }
        return null;
    }

    Expression SensorExpression(){
        Expression Di = Direction();
        if(1 == 1){
            //virus
        }else if(1 == 1){
            // antibody
        }
        return Di;
    }
}
