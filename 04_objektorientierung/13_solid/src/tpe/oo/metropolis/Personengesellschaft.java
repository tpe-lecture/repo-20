package tpe.oo.metropolis;

import java.util.LinkedList;

public class Personengesellschaft extends Unternehmen implements Einkommenssteuerpflichtig {
    
    private LinkedList<Buerger> inhaber = new LinkedList<Buerger>();
    
    /**
     * erstellt eine Instanz von <b>Personengesellschaft</b> <p>
     * Eine Personengesellschaft zahlt Einkommen- und Gewerbesteuer, außerdem hat Sie Bürger als Inhaber.
     * @param name Name der Personengesellschaft (aus der Klasse Unternehmen)
     * @param gewinn Gewinn der Personengesellschaft (aus der Klasse Unternehmen)
     */
    public Personengesellschaft(String name, int gewinn ) {
        this.name=name;
        this.gewinn=gewinn;
    }
    
    /**
     * implementiert die Methode gewerbesteuer() aus dem Interface Gewerbesteuerpflichtig
     * @return den Wert der Gewerbesteuer als int
     */
    @Override
    public int gewerbesteuer() {
        int steuer=(int)(this.gewinn*Gewerbesteuerpflichtig.STEUERSATZ);
        if(steuer<=800) {
            return 0;
        } else {
            return steuer-800;
        }
    }
    
    /**
     * implementiert die Methode steeur() aus dem Interface Steuerpflichtig
     * @return den Wert der Gewerbesteuer und der Einkommensteuer als int
     */
    @Override
    public int steuer() {
        return gewerbesteuer()+einkommenSteuer();
    }
    
    /**
     * implementiert die Methode einkommenSteuer() aus dem Interface Einkommensteuerpflichtig
     * @return den Wert der Einkommensteuer als int
     */
    @Override
    public int einkommenSteuer() {
            int versteuertesgewinn=0;
            if (this.gewinn<=20000){
                versteuertesgewinn=(int)(this.gewinn*STEUERSATZ_1);
                return versteuertesgewinn;
            }else if(this.gewinn<=60000) {
                int rest=this.gewinn-20000;
                versteuertesgewinn=(int)(20000*STEUERSATZ_1+rest*STEUERSATZ_2);
                return versteuertesgewinn;
            }else if(this.gewinn<=120000) {
                int rest=this.gewinn-60000;
                versteuertesgewinn=(int)(20000*STEUERSATZ_1+40000*STEUERSATZ_2+rest*STEUERSATZ_3);
                return versteuertesgewinn;
            }else if(this.gewinn>120000) {
                int rest=this.gewinn-120000;
                versteuertesgewinn=(int)(20000*STEUERSATZ_1+40000*STEUERSATZ_2+60000*STEUERSATZ_3+rest*STEUERSATZ_4);
                return versteuertesgewinn;
            }else return -1;
        }
    
  
    /**
     * fügt der Liste inhaber einen Bürger hinzu
     * @param inhaber der gewünschte Bürger
     */
    public void addInhaber(Buerger inhaber) {
        this.inhaber.add(inhaber);
    }
    
    /**
     * implementiert die Methode getname() aus dem Interface Steuerpflichtig
     */
    public String getname() {
        return name;
    }
    

}
