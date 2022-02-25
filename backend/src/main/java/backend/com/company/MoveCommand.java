package com.company;

public class MoveCommand implements Statement{
    Statement direction;
    Unit unit;

    MoveCommand(Statement direction, Unit unit){
        this.direction = direction;
        this.unit = unit;
    }

    @Override
    public void eval() {

    }
}
