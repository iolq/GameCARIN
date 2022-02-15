import java.beans.Expression;

public interface Cell {
    int Hp = 0, Armor = 0, MaxHp = 0;

    int moveTo();

    int shootTo();

    int Armor();

    int Hp();

    int DeHp();

    int DeArmor();
}
