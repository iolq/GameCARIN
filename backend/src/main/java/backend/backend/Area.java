package backend.backend;

import backend.com.company.Antibody;
import backend.com.company.Virus;

import java.util.List;

public class Area {
    private Integer maxWidth;
    private Integer maxHeight;
    private int Cost;
    private int countVirus;
    private int countAntibody;
    private List<Antibody> list;

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

        countVirus++;
    }
    public void deleteVirus(Virus virus){

        countVirus--;
    }
    public void deleteAntibody(Antibody anti){

        countAntibody--;
    }
}
