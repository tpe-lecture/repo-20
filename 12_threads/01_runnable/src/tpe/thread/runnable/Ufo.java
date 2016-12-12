package tpe.thread.runnable;

import java.awt.Graphics;
import java.awt.Point;

import de.smits_net.games.framework.board.Board;
import de.smits_net.games.framework.image.SimpleImage;

/**
 * Ein Ufo.
 */
public class Ufo extends SimpleImage implements Runnable {
// TODO: Runnable implementieren

    /** X-Position des Ufos. */
    private int x;

    /** Y-Position des Ufos. */
    private int y;

    /** Zeit, die das Ufo schlafen soll, before es sich weiterbewegt. */
    private int sleepTime;

    /** Das zugehörige Spielfeld. */
    private Board board;

    /**
     * Legt ein neues Ufo an.
     *
     * @param board das Spielfeld.
     * @param x die X-Position für den Start.
     * @param y die Y-Position für den Start.
     * @param sleepTime Zeit, die das Ufo schlafen soll,
     *          before es sich weiterbewegt.
     */
    public Ufo(Board board, int x, int y, int sleepTime) {
        super("assets/ufo");
        this.x = x;
        this.y = y;
        this.sleepTime = sleepTime;
        this.board = board;
    }

    /**
     * Zeichnet das Ufo.
     *
     * @param g Grafik-Kontext.
     */
    public void draw(Graphics g) {
        super.draw(g, new Point(x, y), null);
    }

    @Override
    public void run() {
        while(x < board.getWidth()) {
        x++;
        try {
            Thread.sleep(sleepTime);
        } catch (InterruptedException e) {
            System.out.println("Thread-Fehler");
        }
        }
        return;
    }

    // TODO: run-Methode schreiben in der Methode:
    //       1. Ufo um eins in x-Richtung bewegen
    //       2. für sleepTime Millisekunden schlafen
    //       3. Schritt 1-2 wiederholen, solange Ufo noch auf
    //          Spielfeld sichtbar ist
}
