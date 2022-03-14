
import React from 'react';

import Config from './Config';
import ImgBackground from './ImageBackground';


var BackgroundArea1 = Config.Background;

class Arena extends React.Component {

    componentWillUnmount(){

    }


    componentDidMount() {

        this.init();
        this.fetchUp();
        this.updateUp();
        
    }

    componentDidUpdate() {

     }


    fetchUp() {

     }

    updateUp(){

    }

    init(){

        const canvas = document.querySelector('canvas')
        canvas.width = 1920;
        canvas.height = 1080;
        var imbackground = new ImgBackground(BackgroundArea1,0,0,1920,1080)
        imbackground.draw()
    }

    render() {
        return (
            <canvas 
                width={800}
                height={600}
            />
        );
    }

}

export default Arena;
