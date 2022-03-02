package backend.backend;

import backend.com.company.Antibody;
import backend.com.company.Virus;

import java.util.List;
import java.util.Random;

public class Area {
    private Integer maxWidth;
    private Integer maxHeight;
    protected int Cost;
    protected int countVirus;
    protected int countAntibody;
    protected List<Virus> listVirus;
    private int[][] areas = new int[8][8];
    private Random random = new Random();

    Area(Integer maxW,Integer maxH){
        this.maxHeight = maxH; this.maxWidth = maxW;
        this.countAntibody = 0;
        this.countVirus = 0;
    }

    public void ResultParse(){}
    public void spawnAntibody(){
        countAntibody++;
    }
    public void spawnVirus(){
        int positionX = random.nextInt(8);
        int positionY = random.nextInt(2);
        Virus enemy = new Virus();
        enemy.setPosition(positionX,positionY);
        areas[positionX][positionY] = 1;
        listVirus.add(enemy);
        countVirus++;
    }
    public void deleteVirus(Virus virus){

        countVirus--;
    }
    public void deleteAntibody(Antibody anti){

        countAntibody--;
    }
}
