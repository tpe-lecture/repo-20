package tpe.oo.constructor;

/**
 * Nachtelf aus der Allianz.
 */
public class Nachtelf extends Wesen {

    /** Standardmäßige Stärke der Fähigkeit Naturwiderstand. */
    public static final int STANDARD_NATURWIDERSTAND = 5;
    
    /** Fähigkeit zum Widerstand gegen Naturmagie */
    private int naturwiderstand;
    
    /**
     * 
     * @param name Name des Nachtelfen.
     * <p>
     * Naturwiderstand wird auf Standardwert gesetzt.
     */
    public Nachtelf(String name){
        super(name);
        this.naturwiderstand=STANDARD_NATURWIDERSTAND;
    }
    
    /**
     * 
     * @param name Name des Nachtelfen.
     * @param naturwiderstand gewünschter Naturwiderstand.
     */
    public Nachtelf(String name, int naturwiderstand){
        super(name);
        this.naturwiderstand=naturwiderstand;
    }
    
    
    
    /**
     * Stärke des Naturwiderstandes.
     * 
     * @return the naturwiderstand
     */
    public int getNaturwiderstand() {
        return naturwiderstand;
    }
}
