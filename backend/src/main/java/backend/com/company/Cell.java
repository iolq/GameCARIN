package backend.com.company;

public interface Cell extends Node{

    void moveTo(int x,int y);

    int getATK();

    void dmg(int dmg);

    int getxPosition();
    
    int getyPosition();

    int getshootField();

    void receive(int heal);

    String gettypeCell();

    boolean dead();
}
