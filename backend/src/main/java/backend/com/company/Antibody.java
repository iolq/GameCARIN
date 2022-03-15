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
    public int ATK(){
        return Atk;
    }

    @Override
    public void dmg(int dmg){
        HP -= dmg;
    }

    public int lifeSteal(int life){
        return life;
    }

    public void setPosition(int xpos,int ypos){
        this.xPosition = xpos; this.yPosition = ypos;
    }

    public int HandleCosts(){
        return this.HandleCost;
    }

    public void receive(int heal){
        HP += heal;
    }

    @Override
    public int xPosition(){
        return xPosition;
    }

    @Override
    public int yPosition(){
        return yPosition;
    }

    @Override
    public int shootField() {
        return shoot;
    }
}

