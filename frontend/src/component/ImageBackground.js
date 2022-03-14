
class ImgBackground{

    canvas;
    context;
    Image;
    ImgPath;
    positionX;
    positionY;
    width;
    height;
    constructor(path,x,y,wid,hei){
        this.canvas = document.querySelector('canvas');
        this.context = this.canvas.getContext('2d')
        this.Image=new Image();
        this.ImgPath = path;
        this.positionX=x;
        this.positionY=y;
        this.width=wid;
        this.height=hei;

    }

    draw(){
        this.Image.src = this.ImgPath;
        this.Image.onload=()=>console.log(this.Image)
        this.context.drawImage(this.Image,this.positionX,this.positionY,this.width,this.height)
    }

    

}

export default ImgBackground;