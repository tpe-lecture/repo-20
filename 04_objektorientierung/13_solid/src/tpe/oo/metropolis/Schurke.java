package tpe.oo.metropolis;

public class Schurke extends Mutant implements Einkommenssteuerpflichtig {

    private Superkraft schwaeche;
    
    private boolean verurteilt;
    /**
     * erstellt eine Instanz von <b>Schurke</b>. Ein Schurke kann mit einem Helden kämpfen und besitzt eine Schwäche.
     * @param name Name des Schurken (aus der Klasse Einwohner)
     * @param mutation Mutation des Schurken (aus der Klasse Mutant)
     * @param einkommen Einkommen des Schurken (aus der Klasse Einwohner)
     */
    public Schurke(String name, String mutation, int einkommen) {
        this.name=name;
        this.mutation=mutation;
        this.einkommen=einkommen;
    }
    /**
     * 
     * @param superheld Held, mit welchem der Schurke kämpfen soll.
     * @return true, wenn der Schurke gewinnt, false, wenn der Held gewinnt. 
     */
    public boolean kaempfe(Superheld superheld){
        
        for(int i=0; i<superheld.superkraefte.size(); i++) {
            if(superheld.superkraefte.get(i).equals(schwaeche)) {
                return false;
            }
        }
        return true;
    }
    /**
     * Implementiert die Methode einkommenSteuer() aus dem Interface Einkommenssteuerpflichtig
     */
    @Override
    public int einkommenSteuer() {
        int versteuertesEinkommen=0;
        if (this.einkommen<=20000){
            versteuertesEinkommen=(int)(this.einkommen*STEUERSATZ_1);
            return versteuertesEinkommen;
        }else if(this.einkommen<=60000){
            int rest=this.einkommen-20000;
            versteuertesEinkommen=(int)(20000*STEUERSATZ_1+rest*STEUERSATZ_2);
            return versteuertesEinkommen;
        }else if(this.einkommen<=120000){
            int rest=this.einkommen-60000;
            versteuertesEinkommen=(int)(20000*STEUERSATZ_1+40000*STEUERSATZ_2+rest*STEUERSATZ_3);
            return versteuertesEinkommen;
        }else if(this.einkommen>120000){
            int rest=this.einkommen-120000;
            versteuertesEinkommen=(int)(20000*STEUERSATZ_1+40000*STEUERSATZ_2+60000*STEUERSATZ_3+rest*STEUERSATZ_4);
            return versteuertesEinkommen;
        }else return -1;
    }
    /**
     * berechnet die Steuer des Schurken
     * @return den Wert der Steuer als int
     */
    @Override
    public int steuer() {
        return einkommenSteuer();
    }
    /**
     * setzt das Feld verurteilt auf den gewünschten Wert 
     * @param verurteilt gewünschter Status der Verurteilung
     */
    public void setVerurteilung(boolean verurteilt){
        this.verurteilt=verurteilt;
    }
    /**
     * setzt das Feld schwaeche auf den gewünschten Wert
     * @param schwaeche gewünschte Schwäche
     */
    public void setSchwaeche(String schwaeche) { 
        this.schwaeche = new Superkraft(schwaeche);
    }
    /**
     * 
     * @return das Feld schwaeche
     */   
    public Superkraft getSchwaeche(){
        return this.schwaeche;
    }
    /**
     * implementiert die Methode getname aus dem Interface Steuerpflichtig 
     * @return das Feld name(aus der Klasse Einwohner)
     */
    @Override
    public String getname() {
        return name;
    }
    
    
 
}
