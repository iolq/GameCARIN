package backend.com.company;

public interface Cell extends Node{

    void moveTo(int x,int y);

    int ATK();

    void dmg(int dmg);
}
