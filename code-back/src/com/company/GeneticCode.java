package com.company;

public class GeneticCode {
    Expressions Program(){
        Expressions st = Statement();
        return  st;
    }

    Expressions Statement(){
        Expressions wh = WhileStatement();
        int i = 1;
        if(i == 1){
            Expressions co = Command();
            return co;
        }else if(i == 2){
            Expressions Blo = BlockStatement();
            return Blo;
        }else if(i == 3){
            Expressions If = IfStatement();
            return If;
        }
        return wh;
    }

    Expressions Command(){
        Expressions Ac = ActionCommand();
        int i = 0;

        if(i == 0){
            Expressions As = AssignmentStatement();
            return As;
        }

        return null;
    }

    Expressions AssignmentStatement(){
        Expressions Ex = Expression();
        return Ex;
    }

    Expressions ActionCommand(){
        Expressions Atk = AttackCommand();

        int i = 0;
        if(i == 0){
            Expressions mo = MoveCommand();
        }
        return Atk;
    }

    Expressions MoveCommand(){
        Expressions move = Direction();
        return move;
    }

    Expressions AttackCommand(){
        Expressions Atk = Direction();
        return Atk;
    }

    Expressions Direction(){
//        Move m = new Move();
        return null;
    }

    Expressions BlockStatement(){
        return null;
    }

    Expressions IfStatement(){
        Expressions Ex = Expression();
        if(Ex == Ex){
            Expressions st = Statement();
        }else{
            Expressions st = Statement();
        }
        return null;
    }

    Expressions WhileStatement(){
        Expressions Ex = Expression();
        while(Ex == Ex){
            Expressions St = Statement();
            break;
        }
        return null;
    }

    Expressions Expression(){
        Expressions term = Term();
        if(1 == 1){
            Expressions Ex = Expression();
            // Ex + term
        }else if(2 == 2){
            Expressions Ex = Expression();
            // Ex - term
        }
        return term;
    }

    Expressions Term(){
        Expressions fa = Factor();

        if(1 == 1){
            Expressions t = Term();
            // t * fa
        }else if(1 == 1){
            Expressions t = Term();
            // t / fa
        }else if(1 == 1){
            Expressions t = Term();
            // t % fa
        }
        return fa;
    }

    Expressions Factor(){
        Expressions po = Power();
        if(1 == 1){
            Expressions fa = Factor();
            // po ^ fa
        }
        return Power();
    }

    Expressions Power(){
        Expressions se = SensorExpression();
        if(1 == 1){
            Number i = new Number(1);
            return i;
        }else if(1 == 1){
            // return identify
            return null;
        }else if(1 == 1){
            Expressions Ex = Expression();
            return Ex;
        }
        return null;
    }

    Expressions SensorExpression(){
        Expressions Di = Direction();
        if(1 == 1){
            //virus
        }else if(1 == 1){
            // antibody
        }
        return Di;
    }
}
