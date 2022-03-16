package backend.com.company;

import java.util.Random;

public class Antibody implements Cell {

    private int xPosition;
    private int yPosition;
    private int HandleCost = 30;
    private int dmg;
    private int HP;
    private int shoot = 180;
    private int Armor,Atk,cooldown;
    private String t = "Antibody";

    public Antibody(){
        Random rand = new Random();
        HP = rand.nextInt(10)+60;
        Armor = rand.nextInt(5)+5;
        Atk = rand.nextInt(20)+30;
        cooldown = 4;
    };

    @Override
    public void moveTo(int x, int y) {
        xPosition += x;
        yPosition += y;
    }

    @Override
    public int getATK(){
        return Atk;
    }

    @Override
    public void dmg(int dmg){
        HP -= dmg-Armor;
    }

    public int lifeSteal(int life){
        return life;
    }

    public void setPosition(int xpos,int ypos){
        this.xPosition = xpos; this.yPosition = ypos;
    }

    public int getHandleCosts(){
        return this.HandleCost;
    }

    @Override
    public void receive(int heal){
        HP += heal;
    }

    @Override
    public int getxPosition(){
        return xPosition;
    }

    @Override
    public int getyPosition(){
        return yPosition;
    }

    @Override
    public int getshootField() {
        return shoot;
    }

    @Override
    public String gettypeCell() {
        return t;
    }
}

