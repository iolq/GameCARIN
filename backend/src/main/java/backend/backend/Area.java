package backend.backend;

import backend.com.company.Antibody;
import backend.com.company.Virus;
import backend.com.company.Cell;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.LinkedList;

import java.util.Random;

public class Area implements MouseListener {
    private Integer maxWidth;
    private Integer maxHeight;
    protected int Cost;
    protected int countVirus;
    protected int countAntibody;
    private int[][] areas = new int[8][8];
    private LinkedList<Cell> listVirus;
    private LinkedList<Cell> listAntibody;
    private Random random = new Random();
    private int currentX;
    private int currentY;

    Area(Integer maxW,Integer maxH){
        this.maxHeight = maxH; this.maxWidth = maxW;
        this.countAntibody = 0;
        this.countVirus = 0;
    }

    public void ResultParse(){
        
    }
    public void spawnAntibody(){
        countAntibody++;
    }
    public void spawnVirus(){
        int positionX = random.nextInt(8);
        int positionY = random.nextInt(2);
        Virus enemy = new Virus();
        enemy.setPosition(positionX,positionY);
        areas[positionX][positionY] = 1;
        countVirus++;
    }
    public void deleteVirus(Virus virus){

        countVirus--;
    }
    public void deleteAntibody(Antibody anti){

        countAntibody--;
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

        currentX = e.getX();
        currentY = e.getY();

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
