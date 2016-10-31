package tpe.oo.interfaces.impl;

import java.awt.Point;

import tpe.oo.interfaces.api.AnalogController;
import tpe.oo.interfaces.api.DigitalController;
/**
 * Implementierung eines DualShock4 Controllers.
 * 
 * @author r.lubaschewski
 *
 */
public class DualShock4 implements AnalogController, DigitalController {
    
    private int posIntX;
    private int posIntY;
    private double posDoubleX;
    private double posDoubleY;
    
    @Override
    public void up() {
        posIntY--;
           
    }

    @Override
    public void down() {
        posIntY++;
        
    }

    @Override
    public void left() {
        posIntX--;
        
    }

    @Override
    public void right() {
        posIntX++;
        
    }

    @Override
    public void up(double percentage) {
        posDoubleY-=percentage;
        
    }

    @Override
    public void down(double percentage) {
        posDoubleY+=percentage;
        
    }

    @Override
    public void left(double percentage) {
        posDoubleX-=percentage;
        
    }

    @Override
    public void right(double percentage) {
        posDoubleX+=percentage;
        
    }

    @Override
    public Point getPosition() {
        int posX, posY;
        posX=(int)posDoubleX + posIntX;
        posY=(int)posDoubleY + posIntY;
        Point point = new Point();
        point.translate(posX, posY);
        return (Point) point.clone();
        
    }

}
