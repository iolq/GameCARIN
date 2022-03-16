
import React from 'react';
import Config from './Config';


import GameController from './GameController';
import ImgBackground from './ImageBackground';


var BackgroundArea1 = Config.background1;
var imbackground;
var gameStage;
var time;
var areas;


class Arena extends React.Component {

   count
   
   

    componentWillUnmount(){
        console.warn("componentWillUnmount")
        
    }


    componentDidMount() {
        this.count = this.setState({time:Date.now})
        this.init();
        this.fetchUp();
        this.updateUp();
    }

    componentDidUpdate() {
        this.updateUp();
        this.drawOfset();
     }


    fetchUp() {
        GameController.getStageGame().then(data=>{
            gameStage = data
            console.log(gameStage)
        })
        for(var i=0;i<3;i++){
            GameController.getArea(i+1).then(data=>{
                areas[i] = data;
            })
        }
     }

    updateUp(){
            
    }

    init(){
        const canvas = document.querySelector('canvas')
        canvas.width = 1920;
        canvas.height = 1080;
        imbackground = new ImgBackground(BackgroundArea1,0,0,800,600)
        
    }

    drawOfset(){
        imbackground.draw()
    }

    render() {
        return (
            <canvas 
                
            
            />
        );
    }

}

export default Arena;
