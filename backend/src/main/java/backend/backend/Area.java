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
    protected int countWhiteBlood;
    protected List<WhiteBloodCell> listWhiteBlood = new ArrayList<>();
    private Random random = new Random();
    private GeneticCode gr;


    public Area(int num){
        this.NoArea = num;
        this.countAntibody = 0;
        this.countVirus = 0;
        this.countWhiteBlood=0;
//        this.listVirus = new ArrayList<>();
//        this.listAntibody = new ArrayList<>();

    }

    public void ResultParse(){

        //Antibody version
        //Anti
        for(int i = 0; i < listAntibody.size(); ++i){

            if(listAntibody.get(i).gettypeCell().equals("Healing")){
                for(int j = 0; j < listAntibody.size(); ++j){
                    if(i != j){
                        Cell healCell = listAntibody.get(i);
                        Cell cell = listAntibody.get(j);

                        //Heal
                        if(Math.abs(listAntibody.get(i).getxPosition() - listAntibody.get(j).getxPosition()) <= listAntibody.get(i).getshootField() && Math.abs(listAntibody.get(i).getyPosition() - listAntibody.get(j).getyPosition()) <= listAntibody.get(i).getshootField()){
                            gr = new GeneticCode(healCell, cell, "Heal(H)");
                            gr.call();
                        }else{
                            int xHeal = listAntibody.get(i).getxPosition();
                            int yHeal = listAntibody.get(i).getyPosition();
                            int xAnti = listAntibody.get(j).getxPosition();
                            int yAnti = listAntibody.get(j).getyPosition();
        
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
                    if(Math.abs(listAntibody.get(i).getxPosition() - listVirus.get(j).getxPosition()) <= listAntibody.get(i).getshootField() && Math.abs(listAntibody.get(i).getyPosition() - listVirus.get(j).getyPosition()) <= listAntibody.get(i).getshootField()){
                        gr = new GeneticCode(anti, virus, "ATK(A)");
                        gr.call();
                    } //move
                    else{
                        int xAnti = listAntibody.get(i).getxPosition();
                        int yAnti = listAntibody.get(i).getyPosition();
                        int xVirus = listVirus.get(j).getxPosition();
                        int yVirus = listVirus.get(j).getyPosition();
    
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
                if(Math.abs(listAntibody.get(i).getxPosition() - listVirus.get(j).getxPosition()) <= listVirus.get(i).getshootField() && Math.abs(listAntibody.get(i).getyPosition() - listVirus.get(j).getyPosition()) <= listVirus.get(i).getshootField()){
                    gr = new GeneticCode(anti, virus, "ATK(V)");
                    gr.call();
                } //move
                else{
                    int xAnti = listAntibody.get(j).getxPosition();
                    int yAnti = listAntibody.get(j).getyPosition();
                    int xVirus = listVirus.get(i).getxPosition();
                    int yVirus = listVirus.get(i).getyPosition();

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

    public void setArea(Area number){
        this.countWhiteBlood = number.countWhiteBlood;
        this.countAntibody = number.countAntibody;
        this.NoArea = number.NoArea;
        this.listWhiteBlood = number.listWhiteBlood;
        this.listAntibody = number.listAntibody;
        this.listVirus = number.listVirus;
        this.countVirus = number.countVirus;
    }

    public Area getArea(){
        return this;
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

    public void spawnWhiteBloodCell(WhiteBloodCell anti){
        this.listWhiteBlood.add(anti);
        this.countAntibody++;
    }

    public List<WhiteBloodCell> getListWhiteBlood(){
        return this.listWhiteBlood;
    }

    public int getCountWhite(){
        return this.countWhiteBlood;
    }
}
