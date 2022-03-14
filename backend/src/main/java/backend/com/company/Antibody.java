package backend.com.company;

public class Antibody implements Cell {

    private int xPosition;
    private int yPosition;
    private int HandleCost;

    public Antibody(){};

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

    public int lifeSteal(int life){
        return life;
    }

    public void setPosition(int xpos,int ypos){
        this.xPosition = xpos; this.yPosition = ypos;
    }

    public int HandleCosts(){
        return this.HandleCost;
    }
}
