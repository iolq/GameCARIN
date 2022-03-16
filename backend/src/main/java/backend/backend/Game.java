package backend.backend;


import java.util.ArrayList;
import java.util.List;

import backend.com.company.Antibody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component("Game")
public class Game implements Runnable {
    private Integer WidthScreen;
    private Integer HeightScreen;
    private Time time;
    private Integer stage = 1;
    private Inventory inventory;
    protected List<Area> arena;
    private int cost;

    private List<Antibody> listAntArea1 = new ArrayList<>();

    public Game(){
        this.arena = new ArrayList<>();
        this.arena.add(new Area(1));
        this.arena.add(new Area(2));
        this.arena.add(new Area(3));
        this.time = new Time();
        this.inventory = new Inventory();
        this.HeightScreen = 1090;
        this.WidthScreen = 1920;
        Antibody name = new Antibody();
        this.listAntArea1.add(name);
    }


    public void GameLoop(){
        init();
        while(this.arena.get(0).getValueOfAntibody() != 0 || this.arena.get(1).getValueOfAntibody() != 0
        || this.arena.get(2).getValueOfAntibody() != 0 ) {

            while (this.time.getTime() == 0) {
                System.out.println("pause");
            }
            try{
                Thread.sleep(15000);

                System.out.println("spawn :");
                spawnAnti();
            }catch(InterruptedException e){}


        }
    }

    public void init(){
        this.arena.get(0).countAntibody = 1;

    }

    //ตั้งค่าเริ่มต้น
//    public static void main(String[] args){
//
//        Game start = new Game();
//        start.GameLoop();
//
//    }

    public void setGameStage(int number){

        this.stage = number;
    }

//    public int getGameStage(){
//        return this.stage;
//    }

    public List<Area> getAreas(){
        return this.arena;
    }

    public List<Integer> getScreen(){
        List<Integer> sc = new ArrayList<>();
        sc.add(this.WidthScreen);
        sc.add(this.HeightScreen);
        return sc;
    }

//    public List<Antibody> getListAntArea1(){
//        return this.listAntArea1;
//    }

    public Time getTimes(){
        return this.time;
    }

    public void spawnAnti(){
        Antibody cell = new Antibody();
        this.listAntArea1.add(cell);
    }

    public Game update(){
        return this;
    }
    @Override
    public void run() {
        GameLoop();
    }

}
