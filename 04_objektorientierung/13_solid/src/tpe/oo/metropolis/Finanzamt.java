package tpe.oo.metropolis;

import java.util.LinkedList;

public class Finanzamt {

    private static final Finanzamt FINANZAMT = new Finanzamt();

    private LinkedList<Steuerpflichtig> steuerpflichtige = new LinkedList<Steuerpflichtig>();
    
    /**
     * keine neuen Instanzen von Finanzamt
     */
    private Finanzamt() {
        //leerer Konstruktor
    }

    /**
     * berechnet die Steuer aller Steuerpflichtigen in Metropolis
     * @return Wert aller einzelnen steuern aufaddiert als int
     */
    public int steuer() {
        int steuern=0;
       for(int i=0; i<steuerpflichtige.size(); i++) {
           steuern+=steuerpflichtige.get(i).steuer();
       }
       return steuern;
    }
    
    /**
     * 
     * @return einzige Instanz der Klasse Finanzamt
     */
    public static Finanzamt getFinanzamt() {
        return FINANZAMT;
    }
    
    /**
     * fügt der Liste steuerpflichtige den gewünschten Steuerpflichtigen hinzu
     * @param s gewünschter Steuerpflichtiger
     */
    public void addSteuerpflichtigen(Steuerpflichtig s) {
        steuerpflichtige.add(s);
    }
    
    /**
     * gibt den Namen aller Steuerpflichtigen der Liste steuerplichtige aus
     */
    public void printSteuerpflichtige() {
        for(int i=0; i<steuerpflichtige.size(); i++) {
            System.out.println(i+1+". "+steuerpflichtige.get(i).getname());
        }
    }
    
    /**
     * entfernt den Steuerpflichtigen e aus der Liste steuerpflichtige
     * @param e Steuerpflichtiger, der entfernt werden soll
     */
    public void deleteSteuerpflichtigen(Steuerpflichtig e) {
        steuerpflichtige.remove(e);
    }
    

    

}
