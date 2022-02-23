package backend.backend;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/Game")
public class Connected {
    
    @CrossOrigin
    @RequestMapping(value = "/Stage")
    public void Stage(){}


    @CrossOrigin
    @PostMapping("/Stage")
    public void setStage(){}


}
