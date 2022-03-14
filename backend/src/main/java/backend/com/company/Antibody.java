package backend.com.company;

public class Antibody implements Cell {

    private int xPosition;
    private int yPosition;
    private int HandleCost;
    private int dmg;
    private int HP;

    public Antibody(){
        HP = 500;
    };

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
        HP -= dmg;
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
