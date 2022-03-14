package backend.backend;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/Area")
public class AreaConnected {
    Area a51 = new Area(0);
    @CrossOrigin
    @GetMapping(path="/getArea")
    public Area getArea(){
        return a51;
    }

    @CrossOrigin
    @PostMapping(path = "/setArea")
    public int setArea(@RequestBody int num){
        a51.setArea(num);
        return a51.getArea();
    }

}
