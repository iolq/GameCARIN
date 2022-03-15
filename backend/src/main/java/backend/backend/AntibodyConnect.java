package backend.backend;

import backend.com.company.Antibody;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/Antibody")
public class AntibodyConnect {
    Antibody anti = new Antibody();

    @CrossOrigin
    @GetMapping(path="/getAntibody")
    public Antibody getAntibody(){
        return this.anti;
    }
}
