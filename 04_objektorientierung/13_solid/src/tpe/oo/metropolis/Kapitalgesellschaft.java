package tpe.oo.metropolis;
import java.util.LinkedList;

public class Kapitalgesellschaft extends Unternehmen implements Koerperschaftssteuerpflichtig {
    
    private LinkedList<Buerger> gesellschafter = new LinkedList<Buerger>();
    /**
     * erstellt eine Instanz von <b>Kapitalgesellschaft</b> <p>
     * Eine Kapitalgesellschaft zahlt Körperschafts- und Gewerbesteuer, außerdem hat Sie Bürger als Gesellschafter.
     * @param name Name der Kapitalgesellschaft (aus der Klasse Unternehmen)
     * @param gewinn Gewinn der Kapitalgesellschaft (aus der Klasse Unternehmen)
     */
    public Kapitalgesellschaft(String name, int gewinn) {
        this.name=name;
        this.gewinn=gewinn;
    }
    /**
     * implementiert die Methode steuer() aus dem Interface Steuerpflichtig
     */
    @Override
    public int steuer() {
        return gewerbesteuer()+koerperschaftssteuer();
    }
    /**
     * implementiert die Methode gewerbesteuer() aus dem Interface Gewerbesteuerpflichtig
     */
    @Override
    public int gewerbesteuer() {
       return (int)(this.gewinn*Koerperschaftssteuerpflichtig.STEUERSATZ);
    }
    /**
     * implementiert die Methode aus dem Interface koerperschaftssteuerpflichtig
     */
    @Override
    public int koerperschaftssteuer() {
        return(int)(this.gewinn*Koerperschaftssteuerpflichtig.STEUERSATZ);
    }
    
    /**
     * fügt der Liste gesellschafter einen Bürger hinzu
     * @param gesellschafter Bürger, der hinzugefügt werden soll
     */
    public void addGesellschafter(Buerger gesellschafter) {
        this.gesellschafter.add(gesellschafter);
    }
    /**
     * implementiert die Methode getname() aus dem Interface Steuerpflichtig
     */
    @Override
    public String getname() {
        return name;
    }
    

}
