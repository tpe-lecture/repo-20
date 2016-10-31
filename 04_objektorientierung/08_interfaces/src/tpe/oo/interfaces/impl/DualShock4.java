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

    private AnalogController analogStick = new AnalogControllerImpl();
    private DigitalController digitalStick = new DigitalControllerImpl();

    @Override
    public void up() {
        digitalStick.up();

    }

    @Override
    public void down() {
        digitalStick.down();

    }

    @Override
    public void left() {
        digitalStick.left();

    }

    @Override
    public void right() {
        digitalStick.right();

    }

    @Override
    public void up(double percentage) {
        analogStick.up(percentage);

    }

    @Override
    public void down(double percentage) {
        analogStick.down(percentage);

    }

    @Override
    public void left(double percentage) {
        analogStick.left(percentage);

    }

    @Override
    public void right(double percentage) {
        analogStick.right(percentage);

    }

    @Override
    public Point getPosition() {
        Point resultAnalog = analogStick.getPosition();
        Point resultDigital = digitalStick.getPosition();
        int posX, posY;
        posX = (int)(resultAnalog.getX()+resultDigital.getX());
        posY = (int)(resultAnalog.getY()+resultDigital.getY());

        Point point = new Point(posX, posY);
        return point;
    }

}
