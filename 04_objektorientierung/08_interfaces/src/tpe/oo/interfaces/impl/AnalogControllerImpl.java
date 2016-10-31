package tpe.oo.interfaces.impl;

import java.awt.Point;

import tpe.oo.interfaces.api.AnalogController;

public class AnalogControllerImpl implements AnalogController{

    private double posX=0;
    private double posY=0;
    private Point position = new Point(0, 0);

    @Override
    public void up(double percentage) {
        this.posY-=percentage;

    }

    @Override
    public void down(double percentage) {
        this.posY+=percentage;

    }

    @Override
    public void left(double percentage) {
        this.posX-=percentage;

    }

    @Override
    public void right(double percentage) {
        this.posX+=percentage;

    }

    @Override
    public Point getPosition() {
       int posX;
       int posY;

       posX=(int)this.posX;
       posY=(int)this.posY;
       Point point=new Point();
       point.translate(posX, posY);
       return (Point) point.clone();

    }



}
