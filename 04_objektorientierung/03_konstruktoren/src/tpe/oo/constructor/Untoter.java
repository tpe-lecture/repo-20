package tpe.oo.constructor;

/**
 * Untoter aus der Horde.
 */
public class Untoter extends Wesen {

    /** Standardmäßige Stärke der Fähigkeit zur Unterwasseratmung. */
    public static final int STANDARD_UNTERWASSERATMUNG = 10;

    /** Fähigkeit zur Atmung unter Wasser. */
    private int unterwasseratmung;
    /**
     *
     * @param name Name des Untoten
     * <p>
     * Unterwasseratmung wird auf den Standardwert gesetzt.
     */
    public Untoter(String name){
        super(name);
        this.unterwasseratmung=STANDARD_UNTERWASSERATMUNG;
    }

    /**
     *
     * @param name Name des Untoten
     * @param unterwasseratmung gewünschte Stärke für Unterwasseratmung
     */
    public Untoter(String name, int unterwasseratmung){
        super(name);
        this.unterwasseratmung=unterwasseratmung;
    }


    /**
     * Fähigkeit zur Unterwasseratmung.
     *
     * @return the Stärke der Fähigkeit.
     */
    public int getUnterwasseratmung() {
        return unterwasseratmung;
    }
}
