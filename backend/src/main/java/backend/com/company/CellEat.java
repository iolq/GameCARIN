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

//    @Override
//    public int ATK() {
//        return 0;
//    }

    @Override
    public int getATK(){
        return Atk;
    }

    @Override
    public void dmg(int dmg){
        HP =- dmg;
    }

//    @Override
//    public int getxPosition() {
//        return 0;
//    }
//
//    @Override
//    public int getyPosition() {
//        return 0;
//    }
//
//    @Override
//    public int getshootField() {
//        return 0;
//    }

    public void die(){
        HP = 0;
    }
    
    @Override
    public void receive(int heal){
        HP += heal;
    }

//    @Override
//    public String gettypeCell() {
//        return null;
//    }

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
