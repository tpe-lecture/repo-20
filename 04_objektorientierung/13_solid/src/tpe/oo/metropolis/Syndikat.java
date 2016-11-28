package tpe.oo.metropolis;

import java.util.LinkedList;

public class Syndikat implements Koerperschaftssteuerpflichtig{

    protected String name;
    protected LinkedList<Schurke> schurken = new LinkedList<Schurke>();

    /**
     * erstellt eine neue Instanz von <b>Syndikat</b>. Ein Syndikat hat ein Einkommen, zahlt Körperschaftssteuer
     *  und kann Schurken hinzufügen
     * @param name Name des gewünschten Syndikats
     */
    public Syndikat(String name){
        this.name=name;
    }

    /**
     * berechnet das Einkommen aller Schurken des Syndikats und summiert dieses auf
     * @return aufsummiertes Einkommen aller Schurken
     */
    private int getSyndikatEinkommen(){
        int einkommen=0;
        for(int i=0; i<schurken.size(); i++) {
            einkommen+=schurken.get(i).einkommen;
        }
        return einkommen;
    }
    /**
     * implementiert die Methode steuer() aus dem Interface Steuerpflichtig
     */
    @Override
    public int steuer() {
        return this.koerperschaftssteuer();
    }

    /**
     * implementiert die Methode koerperschaftssteuer() aus dem Interface Koerperschaftssteuerpflichtig
     */
    @Override
    public int koerperschaftssteuer() {
        return (int)(getSyndikatEinkommen()*Koerperschaftssteuerpflichtig.STEUERSATZ);
    }

    /**
     * fügt der Liste schurken einen Schurken hinzu
     * @param schurke gewünschter Schurke
     */
    public void addSchurke(Schurke schurke){
        schurken.add(schurke);

    }
    /**
     * entfernt den gewünschten Schurken aus dem Syndikat
     * @param schurke Schurke, der entfernt werden soll
     */
    public void removeSchurke(Schurke schurke) {
        schurken.remove(schurke);
    }

    /**
     * implementiert die Methode getname() aus dem Interface steuerpflichtig
     */
    @Override
    public String getname() {
        return name;
    }

}
