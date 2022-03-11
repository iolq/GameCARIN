package backend.backend;

import java.util.List;

import org.springframework.stereotype.Component;

import backend.com.company.Antibody;

@Component("inventory")
public class Inventory {
    //private Units Units;
    private int countUnits;
    private List<Antibody> listAntibody;

    public Inventory(){
        this.countUnits = 0;
    }
    
}
