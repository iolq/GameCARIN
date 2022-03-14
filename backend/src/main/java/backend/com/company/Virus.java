package backend.com.company;

public class Virus implements Cell {

    private int CostReward;
    private int xposition;
    private int yposition;

    public Virus(){};

    @Override
    public int moveTo() {
        return 0;
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
        this.xposition = xpos; this.yposition = ypos;
    }
}
