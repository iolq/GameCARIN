package backend.com.company;

public class Move {
    int x, y;
    int width = 600;
    int height = 600; //ช่องละ 60x60

    public void moveUp(int positionY){
        positionY += 60;
    }

    public void moveDown(int positionY){
        positionY -= 60;
    }

    public void moveLeft(int positionX){
        positionX += 60;
    }

    public void moveRight(int positionX){
        positionX -= 60;
    }

    public void moveUpRight(int positionX, int positionY){
        positionX += 60; positionY += 60;
    }

    public void moveUpLeft(int positionX, int positionY){
        positionX -= 60; positionY += 60;
    }

    public void moveDownRight(int positionX, int positionY){
        positionX += 60; positionY -= 60;
    }

    public void moveDownLeft(int positionX, int positionY){
        positionX -= 60; positionY -= 60;
    }
}
