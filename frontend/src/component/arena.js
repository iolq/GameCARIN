import l2FVector from './2FVector';

class Arena{
    Stage;
    Enemy1;
    Enemy2;
    Enemy3;
    MaxUnit;
    Scale;

    constructor(stage,enm1,enm2,emn3,max,scale){
        this.Stage = stage; this.Enemy1 = enm1; this.Enemy2 = enm3; this.MaxUnit; this.Scale = scale;
    }

    getScale(){
        return this.Scale;
    }
}
