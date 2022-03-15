package backend.backend;

import backend.com.company.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.lang.Math;
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
    private GeneticCode gr;



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

        //Antibody version
        //Anti
        for(int i = 0; i < listAntibody.size(); ++i){
            //virus
            for(int j = 0; j < listVirus.size(); ++j){

                Cell anti = listAntibody.get(i);
                Cell virus = listVirus.get(j);
                //shoot
                if(Math.abs(listAntibody.get(i).xPosition() - listVirus.get(j).xPosition()) <= listAntibody.get(i).shootField() && Math.abs(listAntibody.get(i).yPosition() - listVirus.get(j).yPosition()) <= listAntibody.get(i).shootField()){
                    gr = new GeneticCode(anti, virus, "ATK(A)");
                    gr.call();
                } //move
                else{
                    int xAnti = listAntibody.get(i).xPosition();
                    int yAnti = listAntibody.get(i).yPosition();
                    int xVirus = listVirus.get(j).xPosition();
                    int yVirus = listVirus.get(j).yPosition();

                    if(xAnti == xVirus && yAnti < yVirus){
                        gr = new GeneticCode(anti, "Up");
                        
                    }else if(xAnti < xVirus && yAnti < yVirus){
                        gr = new GeneticCode(anti, "UpRight");

                    }else if(xAnti < xVirus && yAnti == yVirus){
                        gr = new GeneticCode(anti, "Right");

                    }else if(xAnti < xVirus && yAnti > yVirus){
                        gr = new GeneticCode(anti, "DownRight");

                    }else if(xAnti == xVirus && yAnti > yVirus){
                        gr = new GeneticCode(anti, "Down");

                    }else if(xAnti > xVirus && yAnti > yVirus){
                        gr = new GeneticCode(anti, "DownLeft");
                        
                    }else if(xAnti > xVirus && yAnti == yVirus){
                        gr = new GeneticCode(anti, "Left");

                    }else if(xAnti > xVirus && yAnti < yVirus){
                        gr = new GeneticCode(anti, "UpLeft");

                    }
                }
            }
        }

        //virus version
        //virus
        for(int i = 0; i < listVirus.size(); ++i){
            //anti
            for(int j = 0; j < listAntibody.size(); ++j){

                Cell anti = listAntibody.get(j);
                Cell virus = listVirus.get(i);
                //shoot
                if(Math.abs(listAntibody.get(i).xPosition() - listVirus.get(j).xPosition()) <= listVirus.get(i).shootField() && Math.abs(listAntibody.get(i).yPosition() - listVirus.get(j).yPosition()) <= listVirus.get(i).shootField()){
                    gr = new GeneticCode(anti, virus, "ATK(V)");
                    gr.call();
                } //move
                else{
                    int xAnti = listAntibody.get(j).xPosition();
                    int yAnti = listAntibody.get(j).yPosition();
                    int xVirus = listVirus.get(i).xPosition();
                    int yVirus = listVirus.get(i).yPosition();

                    if(xVirus == xAnti && yVirus < yAnti){
                        gr = new GeneticCode(virus, "Up");

                    }else if(xVirus < xAnti && yVirus < yAnti){
                        gr = new GeneticCode(virus, "UpRight");

                    }else if(xVirus < xAnti && yVirus == yAnti){
                        gr = new GeneticCode(virus, "Right");

                    }else if(xVirus < xAnti && yVirus > yAnti){
                        gr = new GeneticCode(virus, "DownRight");

                    }else if(xVirus == xAnti && yVirus > yAnti){
                        gr = new GeneticCode(virus, "Down");

                    }else if(xVirus > xAnti && yVirus > yAnti){
                        gr = new GeneticCode(virus, "DownLeft");

                    }else if(xVirus > xAnti && yVirus == yAnti){
                        gr = new GeneticCode(virus, "Left");

                    }else if(xVirus > xAnti && yVirus < yAnti){
                        gr = new GeneticCode(virus, "UpLeft");

                    }
                    gr.call();
                }
            }
        }
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
