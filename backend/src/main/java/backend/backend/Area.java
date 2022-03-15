package backend.backend;

import backend.com.company.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

import java.util.Random;

public class Area {
    @Autowired
    protected int NoArea;
    protected int countVirus;
    protected int countAntibody;
    private int[][] areas = new int[8][8];
    private List<Virus> listVirus;
    private List<Antibody> listAntibody;
    private Random random = new Random();



    public Area(int num){
        this.NoArea = num;
        this.countAntibody = 0;
        this.countVirus = 0;
        this.listVirus = new ArrayList<>();
        this.listAntibody = new ArrayList<>();
//        Virus cotuy = new Virus();
//        this.spawnVirus(cotuy);
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
    public List<Virus> getVirus(){

        return listVirus;
    }
    public List<Antibody> getAntibody(){
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
