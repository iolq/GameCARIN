package backend.backend;

import backend.com.company.Antibody;
import backend.com.company.Virus;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("Game")
public class Game {
    private Integer WidthScreen;
    private Integer HeightScreen;
    private Time time;
    private Integer stage;
    private Inventory inventory;
    private List<Area> arena;
    private int cost;

    Game(){
        this.arena = new ArrayList<>();
        this.arena.add(new Area(1));
        this.arena.add(new Area(2));
        this.arena.add(new Area(3));
        this.time = new Time();
        this.inventory = new Inventory();

    }

    public void GameLoop(){
//        while(this.arena.get(0).getValueOfAntibody() != 0 || this.arena.get(1).getValueOfAntibody() != 0
//        || this.arena.get(2).getValueOfAntibody() != 0 ){
//
//            while(this.time.getTime() == 0){
//                System.out.println("pouse");
//            }
        while(true){

        }

//        }
    }

    public void Update(){

    }

    //ตั้งค่าเริ่มต้น
    public static void main(String[] args){
        
        Game start = new Game();
        start.GameLoop();

    }

    public void setGameStage(int number){
        System.out.println(number);
        this.stage = number;
    }

    public int getGameStage(){
        return this.stage;
    }
}
