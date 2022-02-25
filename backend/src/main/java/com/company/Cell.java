package com.company;

import backend.com.company.Node;

public interface Cell extends Node{
    int Hp = 0, Armor = 0, MaxHp = 0;

    int moveTo();

    int shootTo();

    int Armor();

    int Hp();

    int DeHp();

    int DeArmor();
}
