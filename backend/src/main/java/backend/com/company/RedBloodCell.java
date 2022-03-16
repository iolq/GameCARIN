package backend.com.company;

import java.util.Random;

public class RedBloodCell implements Cell{

    private int CostReward;
    private int xPosition;
    private int yPosition;
    private int HP;
    private int HealField = 120;
    private int Armor,Heal,cooldown;
    private String t = "Healing";

    RedBloodCell(){
        Random rand = new Random();
        HP = rand.nextInt(10)+80;
        Armor = rand.nextInt(5)+10;
        Heal = rand.nextInt(10)+15;
        cooldown = 2;
    }
    
    @Override
    public void moveTo(int x, int y) {
        xPosition += x;
        yPosition += y;
    }

    @Override
    public int getATK(){
        return Heal;
    }

    @Override
    public void dmg(int dmg){
        HP =- dmg-Armor;
    }

    // public int Heal(){
    //     return Heal;
    // }

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
        return HealField;
    }

    @Override
    public void receive(int heal) {
        
    }

    @Override
    public String gettypeCell() {
        return t;
    }
}
