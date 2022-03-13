import axios from "axios";
import Config from "./Config";


class GameController{
    static getArea(numberofstage){
        const UrlofArea = Config.url + "Area/getArea/" + {numberofstage}
        if(UrlofArea){
            return {
                virus:{},
                
            }
        }
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