package backend.com.company;

public class Virus implements Cell {

    private int CostReward;
    private int xPosition;
    private int yPosition;

    public Virus(){};

    @Override
    public void moveTo(int x, int y) {
        xPosition += x;
        yPosition += y;
    }

    @Override
    public int shootTo() {
        return 0;
    }

    @Override
    public int Armor() {
        return 0;
    }

    @Override
    public int Hp() {
        return 0;
    }

    @Override
    public int DeHp() {
        return 0;
    }

    @Override
    public int DeArmor() {
        return 0;
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
    
}
