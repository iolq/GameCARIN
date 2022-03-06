package backend.backend;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Game")
public class Connected {
    Game game = new Game();

    @CrossOrigin
    @GetMapping(value = "/getStage")
    public Game getStage(){
        return game;
    }


    @CrossOrigin
    @PostMapping("/setStage")
    public int setStage(@RequestBody Game num){
        game.setGameStage(num.getGameStage());

        return num.getGameStage();
    }


}
