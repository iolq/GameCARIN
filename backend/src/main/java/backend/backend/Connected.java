package backend.backend;


import backend.com.company.Antibody;
import backend.com.company.WhiteBloodCell;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/Game")
public class Connected{
    @Autowired
    Game game = new Game();

    @CrossOrigin
    @GetMapping(path = "/getStage")
    public Game getStage(){
        game.update();
        return this.game;
    }


    @CrossOrigin
    @PostMapping(path = "/setStage")
    public int setStage(@RequestBody API num){
        System.out.println("getStageGame = " + num.getStageGame());
        game.setGameStage(num.getStageGame());
        return num.getStageGame();
    }

}
