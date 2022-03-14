package backend.com.company;

public interface Cell extends Node{
    int Hp = 0, Armor = 0, MaxHp = 0;

    void moveTo(int x,int y);

    int shootTo();

    int Armor();

    int Hp();

    int DeHp();

    int DeArmor();
}
