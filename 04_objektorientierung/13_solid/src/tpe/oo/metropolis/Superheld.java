package tpe.oo.metropolis;

import java.util.LinkedList;

public class Superheld extends Mutant {

    protected LinkedList<Superkraft> superkraefte=new LinkedList<Superkraft>();
    /**
     * Erstellt eine Instanz von <b>Superheld</b>. Ein Superheld kann kämpfen und eine oder mehrere Superkräfte besitzen. 
     * <p>
     * Steuern zahlt er keine, weil er in Metropolis so viel Gutes tut. 
     * @param name Name des Helden (von der Klasse Einwohner)
     * @param mutation Mutation des Helden (von der Klasse Mutant)
     * @param einkommen Einkommen des Helden (von der Klasse Einwohner)
     */
    public Superheld(String name, String mutation, int einkommen){
        this.name=name;
        this.mutation=mutation;
        this.einkommen=einkommen;
    }
    /**
     * 
     * @param schurke Schurke, mit dem der Held kämpfen soll
     * @return true, wenn der Held gewinnt, false, wenn der Schurke gewinnt
     */
    public boolean kaempfe(Schurke schurke) {
        //Schleife durchläuft die Liste superkraefte und gleicht mit der Schwäche des Schurken ab
        for(int i=0; i<superkraefte.size(); i++) {
            if(schurke.getSchwaeche().equals(superkraefte.get(i))) {
                return true;
            }
        }
        return false;
    }
    
    /**
     * für der Liste superkraefte eine Superkraft hinzu
     * @param s Superkraft, die hinzugefügt werden soll
     */
    public void addSuperkraft(Superkraft s){
        superkraefte.add(s);
    }
    
    
    
    
}
