package backend.backend;

public class Area {
    private Integer maxWidth;
    private Integer maxHeight;
    private int Cost;
    private int countVirus;
    private int countAntibody;


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
