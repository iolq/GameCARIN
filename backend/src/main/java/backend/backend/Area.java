package backend.backend;

import backend.com.company.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.lang.Math;
import java.util.Random;


public class Area {
    protected int NoArea;
    protected int countVirus;
    protected int countAntibody;
    protected int[][] areas = new int[8][8];
    protected List<Virus> listVirus = new ArrayList<>();
    protected List<Antibody> listAntibody = new ArrayList<>();
    private Random random = new Random();
    private GeneticCode gr;


    public Area(int num){
        this.NoArea = num;
        this.countAntibody = 0;
        this.countVirus = 0;
//        this.listVirus = new ArrayList<>();
//        this.listAntibody = new ArrayList<>();

    }

    public void ResultParse(){

        //Antibody version
        //Anti
        for(int i = 0; i < listAntibody.size(); ++i){

            if(listAntibody.get(i).typeCell().equals("Healing")){
                for(int j = 0; j < listAntibody.size(); ++j){
                    if(i != j){
                        Cell healCell = listAntibody.get(i);
                        Cell cell = listAntibody.get(j);

                        //Heal
                        if(Math.abs(listAntibody.get(i).xPosition() - listAntibody.get(j).xPosition()) <= listAntibody.get(i).shootField() && Math.abs(listAntibody.get(i).yPosition() - listAntibody.get(j).yPosition()) <= listAntibody.get(i).shootField()){
                            gr = new GeneticCode(healCell, cell, "Heal(H)");
                            gr.call();
                        }else{
                            int xHeal = listAntibody.get(i).xPosition();
                            int yHeal = listAntibody.get(i).yPosition();
                            int xAnti = listAntibody.get(j).xPosition();
                            int yAnti = listAntibody.get(j).yPosition();
        
                            if(xHeal == xAnti && yHeal < yAnti){
                                gr = new GeneticCode(healCell, "Up");
                                
                            }else if(xHeal < xAnti && yHeal < yAnti){
                                gr = new GeneticCode(healCell, "UpRight");
        
                            }else if(xHeal < xAnti && yHeal == yAnti){
                                gr = new GeneticCode(healCell, "Right");
        
                            }else if(xHeal < xAnti && yHeal > yAnti){
                                gr = new GeneticCode(healCell, "DownRight");
        
                            }else if(xHeal == xAnti && yHeal > yAnti){
                                gr = new GeneticCode(healCell, "Down");
        
                            }else if(xHeal > xAnti && yHeal > yAnti){
                                gr = new GeneticCode(healCell, "DownLeft");
                                
                            }else if(xHeal > xAnti && yHeal == yAnti){
                                gr = new GeneticCode(healCell, "Left");
        
                            }else if(xHeal > xAnti && yHeal < yAnti){
                                gr = new GeneticCode(healCell, "UpLeft");
        
                            }
                        }
                    }
                }
            }else{
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
