public class move {
    int x, y;
    int width = 600;
    int height = 600; //ช่องละ 60x60

    public void moveUp(){
        if(y+60 < 600) y += 60;
    }

    public void moveDown(){
        if(y-60 > 0) y -= 60;
    }

    public void moveLeft(){
        if(x-60 > 600) x -= 60;
    }

    public void moveRight(){
        if(x+60 < 600) x += 60;
    }

}
