package tpe.oo.metropolis;

public class Metropolis {
    
    private static final Metropolis METROPOLIS = new Metropolis();
    
    private Einwohner[] einwohner = new Einwohner[10];
    
    private Unternehmen[] unternehmen = new Unternehmen[10];
    
    /**
     * keine neuen Instanzen von Metropolis
     */
    
    private Metropolis(){
        //leerer Konstruktor
    }
    
    /**
     * gibt einzige Instanz von Metropolis zurück
     * @return METROPOLIS
     */
    public static Metropolis getMetropolis(){
        return METROPOLIS;
    }
    
    public void addEinwohner(Einwohner e){
        for(int i=0; i<=einwohner.length; i++){
            if(einwohner[i]==null){
                einwohner[i]=e;
                return;
            }
        }
    }
    
    public void addUnternehmen(Unternehmen e){
        for(int i=0; i<=unternehmen.length; i++){
            if(unternehmen[i]==null){
                unternehmen[i]=e;
                return;
            }
        }
    }
    
    

}
