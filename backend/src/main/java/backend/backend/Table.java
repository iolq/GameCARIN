package backend.backend;

import backend.com.company.Antibody;

public class Table {
    private Area arena;
    private Antibody onHandleAntibody;
    private int xPos;
    private int yPos;

    public Table(Area a,int x,int y){
        this.arena = a; this.xPos = x; this.yPos = y;
    }

    public Antibody getonHandleAntibody(){
        return this.onHandleAntibody;
    }

    public int getPositionY(){
        return this.yPos;
    }

    public int getPositionX(){
        return this.xPos;
    }
}
