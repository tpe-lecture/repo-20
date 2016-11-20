package tpe.oo.metropolis;

public class Richter extends Mensch {
    
    protected boolean isCorrupt;
    /**
     * erstellt eine Instanz von <b>Richter</b>. Ein Richter ist entweder korrupt oder nicht korrupt, außerdem 
     * kann er Schurken verurteilen.
     * @param name Name des Richters (aus der Klasse Einwohner)
     * @param alter Alter des Richters (aus der Klasse Mensch)
     * @param einkommen Einkommen des Richters (aus der Klasse Einwohner)
     * @param isCorrupt gibt an, ob der Richter korrupt ist oder nicht
     */
    public Richter(String name, int alter, int einkommen, boolean isCorrupt){
        this.name=name;
        this.alter=alter;
        this.einkommen=einkommen;
        this.isCorrupt=isCorrupt;
    }
    /**
     * verurteilt den Schurken abhängig davon, ob der Richter korrupt ist oder nicht
     * @param s Schurke, der verurteilt werden soll
     * @return true, wenn der Schurke verurteilt wurde, false, wenn nicht
     */
    public boolean verurteile(Schurke s) {
        if(this.isCorrupt) {
            s.setVerurteilung(false);
            return false;
        } 
        else {
            s.setVerurteilung(true);
            return true;
        }
    }
}
