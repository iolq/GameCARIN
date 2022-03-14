package backend.backend;

import backend.com.company.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.LinkedList;

import java.util.Random;


public class Area {
    private Integer maxWidth;
    private Integer maxHeight;
    protected int NoArea;
    protected int countVirus;
    protected int countAntibody;
    private int[][] areas = new int[8][8];
    private LinkedList<Virus> listVirus;
    private LinkedList<Antibody> listAntibody;
    private Random random = new Random();
    private int currentX;
    private int currentY;


    public Area(int num){
        this.NoArea = num;
        this.countAntibody = 1;
        this.countVirus = 1;
        this.listVirus = new LinkedList<>();
        this.listAntibody = new LinkedList<>();
        Antibody cell = new Antibody();
        this.listAntibody.add(cell);
    }

    public void ResultParse(){

    }
    public void spawnAntibody(Antibody anti){
        this.listAntibody.add(anti);
        countAntibody++;
    }
    public void spawnVirus(Virus virul){
        this.listVirus.add(virul);
        countVirus++;
    }
    public void deleteVirus(Virus virus){
        this.listVirus.remove(virus);
        countVirus--;
    }
    public void deleteAntibody(Antibody anti){
        this.listAntibody.remove(anti);
        countAntibody--;
    }
    public LinkedList<Virus> getVirus(){

        return listVirus;
    }
    public LinkedList<Antibody> getAntibody(){
        return listAntibody;
    }

    public void setUnitToArea(){
        
    }

    public void setArea(int number){
        this.NoArea = number;
    }

    public int getArea(){
        return this.NoArea;
    }

    public int getValueOfAntibody(){
        return this.countAntibody;
    }
    public int getValueOfVirus(){
        return this.countVirus;
    }
}
