import axios from "axios";
import Config from "./Config";


class GameController{

    static GetController = () =>{
        var getGameStage = axios.get(Config.url + 'Game/getStage')

        return getGameStage.data;
    }

    static PostController = () =>{
        var setGameStage = axios.post(Config.url + "Game/setStage")
        return setGameStage;
    }
    
}
export default GameController;