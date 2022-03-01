package backend.backend;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/Game")
public class Connected {
    
    @CrossOrigin
    @RequestMapping(value = "/getStage")
    public void Stage(){

    }


    @CrossOrigin
    @PostMapping("/setStage")
    public void setStage(@RequestBody int i){
        
    }


}
