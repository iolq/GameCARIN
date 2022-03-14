package backend.backend;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;


import backend.com.company.Antibody;

@Component("inventory")
public class Inventory {
    //private Units Units;
    private int countUnits;
    protected List<Antibody> listAntibody;

    public Inventory(){
        this.countUnits = 0;
        this.listAntibody = new ArrayList<>();
    }

    public void setInventory(Inventory invent){
        this.countUnits = invent.countUnits; this.listAntibody = invent.listAntibody;
    }

}
