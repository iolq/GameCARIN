package backend.com.company;

public interface Cell extends Node{

    void moveTo(int x,int y);

    int shootTo();

    int Armor();

    int Hp();

    int DeHp();

    int DeArmor();

    int ATK();

    void dmg(int dmg);
}
