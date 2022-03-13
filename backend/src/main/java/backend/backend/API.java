package backend.backend;

import org.springframework.web.bind.annotation.RequestMapping;


public class API {
    private int Stage = 3;

    public void setStageGame(int something){
        this.Stage = something;
    }

    public int getStageGame(){
        return this.Stage;
    }

}
