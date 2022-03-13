package backend.backend;

import backend.com.company.Antibody;
import backend.com.company.Virus;
import org.springframework.stereotype.Component;

import java.util.LinkedList;

import java.util.Random;

@Component("Area")
public class Area {
    private Integer maxWidth;
    private Integer maxHeight;
    protected int numberofarea;
    protected int Cost;
    protected int countVirus;
    protected int countAntibody;
    private int[][] areas = new int[8][8];
    private LinkedList<Virus> listVirus;
    private LinkedList<Antibody> listAntibody;
    private Random random = new Random();
    private int currentX;
    private int currentY;

    Area(){
        this.countAntibody = 0;
        this.countVirus = 0;
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
        this.numberofarea = number;
    }

    public int getArea(){
        return this.numberofarea;
    }

}
