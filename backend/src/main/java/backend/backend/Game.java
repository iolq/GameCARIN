package backend.backend;

import backend.com.company.Antibody;
import backend.com.company.Virus;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;

public class Game {
    private Integer WidthScreen;
    private Integer HeightScreen;
    private Time time;
    private int state;
    private Inventory inventory;
    private Area arena;

    Game(Integer width,Integer height){
        this.HeightScreen = height;
        this.WidthScreen = width;
        this.arena = new Area(WidthScreen, HeightScreen);
    }

    public void GameLoop(){
        init();
        while(true){
            Update();
            try{
                Thread.sleep(3000);
            }catch(InterruptedException e){}
            arena.spawnVirus();
            System.out.println(arena.countVirus);

        }
    }

    public void Update(){

            System.out.println(this.arena.countVirus);

    }

    //ตั้งค่าเริ่มต้น
    public void init(){
        Antibody redCell = new Antibody();
        Antibody whiteCell = new Antibody();
        Antibody wallCell = new Antibody();
        Virus coVid = new Virus();
        Virus LFMO = new Virus();
        Virus LMOFF = new Virus();
    }
    public static void main(String[] args){
        
        Game start = new Game(1320, 960);
        start.GameLoop();

    }
}
