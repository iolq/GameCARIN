package backend.backend;


import java.util.ArrayList;
import java.util.List;

import backend.com.company.Antibody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component("Game")
public class Game {
    private Integer WidthScreen;
    private Integer HeightScreen;
    private Time time;
    private Integer stage = 1;
    private Inventory inventory;
    protected List<Area> arena;
    private int cost;
    private int countAntibody;
    private List<Antibody> area1;

    Game(){
        this.arena = new ArrayList<>();
        this.arena.add(new Area(1));
        this.arena.add(new Area(2));
        this.arena.add(new Area(3));
        this.time = new Time();
        this.inventory = new Inventory();
        this.HeightScreen = 1090;
        this.WidthScreen = 1920;
        this.area1 = new ArrayList<>();
    }

    public void GameLoop(){
        Antibody name = new Antibody();
        spawnAntibody(name);
        init();
        while(this.arena.get(0).getValueOfAntibody() != 0 || this.arena.get(1).getValueOfAntibody() != 0
        || this.arena.get(2).getValueOfAntibody() != 0 ){

            while(this.time.getTime() == 0){
                System.out.println("pouse");
            }

        }
    }
    public void init(){
        this.arena.get(0).countAntibody=1;
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

    public List<Area> getAreas(){
        return this.arena;
    }

    public List<Integer> getScreen(){
        List<Integer> sc = new ArrayList<>();
        sc.add(this.WidthScreen);
        sc.add(this.HeightScreen);
        return sc;
    }

    public List<Antibody> getAntibodyInArea1(){
        return this.area1;
    }

    public void spawnAntibody(Antibody ant){
        this.area1.add(ant);
        this.countAntibody++;
    }
}
