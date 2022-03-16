package backend.com.company;

import java.util.Random;

public class CellEat implements Cell{
    private int CostReward;
    private int xPosition;
    private int yPosition;
    private int HP;
    private int shoot = 60;
    private int Armor,Atk;
    private String t = "CellEat";
    private boolean dead = false;

    CellEat(){
        Random rand = new Random();
        HP = rand.nextInt(10)+100;
        Armor = rand.nextInt(5)+20;
        Atk = 99999;
    }
    
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


    public void die(){
        HP = 0;
        dead = true;
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
