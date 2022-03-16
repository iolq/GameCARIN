package backend.com.company;

import java.util.Random;

public class WhiteBloodCell implements Cell{
    private int CostReward;
    private int xPosition;
    private int yPosition;
    private int HP;
    private int shoot = 120;
    private int Armor = 0;
    private int Atk = 0;
    private int cooldown = 0;
    private String t = "White";

    public WhiteBloodCell(){
        Random rand = new Random();
        HP = rand.nextInt(10)+120;
        Armor = rand.nextInt(10)+20;
        Atk = rand.nextInt(10)+10;
        cooldown = 2;
    }
    
    @Override
    public void moveTo(int x, int y) {
        xPosition += x;
        yPosition += y;
    }

    @Override
    public int getATK(){
        return 0;
    }

    @Override
    public void dmg(int dmg){
        HP =- dmg-Armor;
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
