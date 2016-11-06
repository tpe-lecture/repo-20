package tpe.oo.singleton;

/**
 * Batmans Cave.
 */
public final class Batcave {

    /** Keine Instanzen. */
    private Batcave() {
        // leer
    }
    
    /**
     * Hauptmethode.
     * 
     * @param args Argumente von der Kommandozeile.
     */
    public static void main(String[] args) {     
        
        System.out.println(Batman.getInstance().toString());
        Batman.getInstance().umziehen();
        System.out.println(Batman.getInstance().toString());
        System.out.println();
        
    }    
}
