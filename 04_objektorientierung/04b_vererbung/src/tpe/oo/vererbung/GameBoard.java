package tpe.oo.vererbung;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;

import de.smits_net.games.framework.board.Board;
import de.smits_net.games.framework.image.ImageBase;
import de.smits_net.games.framework.sprite.Sprite;
import tpe.oo.vererbung.*;

/**
 * Spielfeld.
 */
public class GameBoard extends Board {
// TODO: Von Board ableiten

    /** Alien, das durch das Bild läuft. */
    private AlienSprite alien1;
    
    private AlienSprite alien2;

    /** Asteroid. */
    private Sprite asteroid;
    
    private Sprite asteroid1;

    /** Hintergrundbild. */
    private Image background;

    /**
     * Erzeugt ein neues Board.
     */
    
    public GameBoard() {
// TODO: Einkommentieren
//        // neues Spielfeld anlegen
        super(10, new Dimension(800, 600), Color.BLACK);

        // Hintergrundbild laden
        background = ImageBase.loadImage("assets/background");


        // TODO: Alien und Asteroid anlegen und positionieren
        this.alien1 = new AlienSprite(this, new Point(10,300));
        this.alien2 = new AlienSprite(this, new Point(10,500));
        this.asteroid = new Asteroid(this, new Point(100,300));
        this.asteroid1 = new Asteroid(this, new Point(100,550));
        
    }

    /**
     * Hintergrund zeichnen.
     */
    protected void drawBackground(Graphics g) {
        g.drawImage(background, 0, 0, null);
    }

    /**
     * Spielfeld neu zeichnen. Wird vom Framework aufgerufen.
     *
     * @param g Der Grafik-Kontext
     */
    public void drawGame(Graphics g) {
        // TODO: Alle Objekte zeichnen
        this.alien1.draw(g);
        this.alien2.draw(g);
        this.asteroid.draw(g);
        this.asteroid1.draw(g);
        
        
    }

    /**
     * Spielsituation updaten. Wird vom Framework aufgerufen.
     *
     * @return Spiel läuft weiter, solange diese methode <code>true</code>
     *      zurück gibt
     */
    public boolean updateGame() {

        this.alien1.move();
        this.alien2.move();
        this.asteroid.move();
        this.asteroid1.move();
        

        // Kollision erkennen
// TODO: Einkommentieren
        if (alien1.intersects(asteroid) && alien1.isActive()) {
            alien1.explode();
        }
        
        if (alien2.intersects(asteroid1) && alien2.isActive()) {
            alien2.explode();
        }

        return true;
    }
}
