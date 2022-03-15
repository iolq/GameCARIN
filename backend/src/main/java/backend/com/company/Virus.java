package backend.com.company;

import java.util.Random;

public class Virus implements Cell {

    private int CostReward;
    private int xPosition;
    private int yPosition;
    private int HP;
    private int shoot = 120;
    private int Armor,Atk,cooldown;

    public Virus(){
        Random rand = new Random();
        HP = rand.nextInt(10)+150;
        Armor = rand.nextInt(5)+25;
        Atk = rand.nextInt(10)+27;
        cooldown = 2;
    };

    @Override
    public void moveTo(int x, int y) {
        xPosition += x;
        yPosition += y;
    }


    public void setReward(int num){
        this.CostReward = num;
    }

    public int lifeSteal(int life){
        return life;
    }

    public void setPosition(int xpos,int ypos){
        this.xPosition = xpos; this.yPosition = ypos;
    }

    @Override
    public int ATK(){
        return Atk;
    }

    @Override
    public void dmg(int dmg){
        HP =- dmg-Armor;
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
