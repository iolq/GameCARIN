package backend.backend;

import backend.com.company.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

import java.util.Random;


public class Area {
    protected int NoArea;
    protected int countVirus;
    protected int countAntibody;
    protected int[][] areas = new int[8][8];
    protected List<Virus> listVirus = new ArrayList<>();
    protected List<Antibody> listAntibody = new ArrayList<>();
    private Random random = new Random();


    public Area(int num){
        this.NoArea = num;
        this.countAntibody = 0;
        this.countVirus = 0;
//        this.listVirus = new ArrayList<>();
//        this.listAntibody = new ArrayList<>();

    }

    public void ResultParse(){

    }
    public void spawnAntibody(Antibody anti){
        this.listAntibody.add(anti);
        this.countAntibody++;
    }
    public void spawnVirus(Virus virul){
        this.listVirus.add(virul);
        this.countVirus++;
    }
    public void deleteVirus(Virus virus){
        this.listVirus.remove(virus);
        this.countVirus--;
    }
    public void deleteAntibody(Antibody anti){
        this.listAntibody.remove(anti);
        this.countAntibody--;
    }

    public List<Virus> getListVirus(){
        return this.listVirus;
    }

    public List<Antibody> getListAntibody(){

        return this.listAntibody;
    }

//    public void setUnitToArea(){
//
//    }

    public void setArea(int number){
        this.NoArea = number;
    }

    public int getArea(){
        return this.NoArea;
    }

    public int getValueOfAntibody(){
        return countAntibody;
    }
    public int getValueOfVirus(){
        return countVirus;
    }

    public void setValueOfAntibody(int num){
        this.countAntibody += num;
    }
}
