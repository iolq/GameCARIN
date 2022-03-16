package backend.backend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/Area")
public class AreaConnected {

    private Area a51;
    private Area a52;
    private Area a53;

    public AreaConnected(Game gae){
        this.a51 = gae.arena.get(0);
        this.a52 = gae.arena.get(1);
        this.a53 = gae.arena.get(2);
    }
    @CrossOrigin
    @GetMapping(path="/getArea1")
    public Area getArea1(){
        System.out.println(a51.countAntibody);
        return a51;
    }
    @CrossOrigin
    @GetMapping(path="/getArea2")
    public Area getArea2(){
        System.out.println(a52);
        return a52;
    }

    @CrossOrigin
    @GetMapping(path="/getArea3")
    public Area getArea3(){
        System.out.println(a53);
        return a53;
    }

    @CrossOrigin
    @PostMapping
    public void setArea1(@RequestBody Area a){
        
    }

}
