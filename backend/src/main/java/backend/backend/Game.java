package backend.backend;

import backend.com.company.Antibody;
import backend.com.company.Virus;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;

import org.springframework.stereotype.Component;

@Component
public class Game {
    private Integer WidthScreen;
    private Integer HeightScreen;
    private Time time;
    private Integer stage;
    private Inventory inventory;
    private Area arena;

    Game(){
        this.time = new Time();
        this.inventory = new Inventory();
        this.arena = new Area(WidthScreen, HeightScreen);
    }

    public void GameLoop(){
        while(true){
            Update();
            
        }
    }

    public void Update(){


    }

    //ตั้งค่าเริ่มต้น
    public static void main(String[] args){
        
        Game start = new Game();
        start.GameLoop();

    }

    public void setGameStage(int number){
        this.stage = number;
    }

    public int getGameStage(){
        return this.stage;
    }
}
