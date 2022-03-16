package backend.com.company;

import java.util.Random;

public class Virus implements Cell {

    private int CostReward;
    private int xPosition;
    private int yPosition;
    private int HP;
    private int shoot = 120;
    private int Armor,Atk,cooldown;
    private String t = "Virus";
    private boolean dead = false;

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
    public int getATK(){
        return Atk;
    }

    @Override
    public void dmg(int dmg){
        HP =- dmg-Armor;
        if(HP <= 0){
            HP = 0;
            dead = true;
        }
    }

    @Override
    public boolean dead() {
        return dead;
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
    public void receive(int heal) {
        
    }

    @Override
    public String gettypeCell() {
        return t;
    }
    
}
