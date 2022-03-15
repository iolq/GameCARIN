import axios from "axios";
import Config from "./Config";


class GameController{
    static async getArea(numberofstage){
        const UrlofArea = Config.url + "Area/getArea" + numberofstage;
        
        var area = await axios.get(UrlofArea)
        return area.data;
    }

    static async getStageGame(){
        var gameStage = await axios.get(Config.url + "Game/getStage")

        return gameStage.data.gameStage;
    } 

    static async setStageGame(gameStage){
        await axios({
            methode: 'post',
            url: Config.url + 'Game/setStage',
            header:{},
            data:{
                gameStage: gameStage
            }
        });
    }
    
}
export default GameController;