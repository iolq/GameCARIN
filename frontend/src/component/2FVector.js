class l2FVector{

    NumX;
    NumY;

    constructor(x,y){
        this.NumX = x; this.NumY = y;
    }

    setX(x){
        this.NumX = x;
    }

    setY(y){
        this.NumY = y;
    }

    getX(){
        return this.NumX;
    }

    getY(){
        return this.NumY;
    }
}