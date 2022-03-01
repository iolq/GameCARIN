package backend.backend;

import backend.com.company.Antibody;

public class Game {
    private Integer WidthScreen;
    private Integer HeightScreen;
    private Time time;
    private int state;
    private Inventory inventory;

    Game(Integer width,Integer height){
        this.HeightScreen = height;
        this.WidthScreen = width;
        
    }

    public void GameLoop(){
        while(true){
            
        }
    }

    public void Update(){
            //inventory;
            //time;
            //state;
            
    }

    //ตั้งค่าเริ่มต้น
    public static void init(){
        Antibody redCell = new Antibody();
        Antibody whiteCell = new Antibody();
        

    }
    public static void main(String[] args){
        
    }
}
