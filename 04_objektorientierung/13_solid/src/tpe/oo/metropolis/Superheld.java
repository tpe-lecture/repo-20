package tpe.oo.metropolis;

public class Superheld extends Mutant {

    protected Superkraft[] superkraefte;
    
    public Superheld(String name, String mutation, int einkommen){
        this.name=name;
        this.mutation=mutation;
        this.einkommen=einkommen;
    }
    
    public boolean kaempfe(Schurke schurke) {
        for(Superkraft s : superkraefte) {
            if(s.equals(schurke.schwaeche)) {
                return true;
            } 
        } return false;
    }
    
    
}
