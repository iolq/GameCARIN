package backend.com.company;

public class RedBloodCell implements Cell{

    private int CostReward;
    private int xPosition;
    private int yPosition;
    private int HP;
    
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
    @Override
    public int ATK(){
        return 0;
    }

    @Override
    public void dmg(int dmg){
        HP =- dmg;
    }
}
