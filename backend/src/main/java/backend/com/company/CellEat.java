package backend.com.company;

import java.util.Random;

public class CellEat implements Cell{
    private int CostReward;
    private int xPosition;
    private int yPosition;
    private int HP;
    private int shoot = 60;
    private int Armor,Atk;

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
    public int ATK(){
        return Atk;
    }

    @Override
    public void dmg(int dmg){
        HP =- dmg;
    }

    public void die(){
        HP = 0;
    }
    
    public void receive(int heal){
        HP += heal;
    }
    
}
