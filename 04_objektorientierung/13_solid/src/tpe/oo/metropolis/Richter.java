package tpe.oo.metropolis;

public class Richter extends Mensch {
    
    protected boolean isCorrupt;
    
    public Richter(String name, int alter, boolean isCorrupt){
        this.name=name;
        this.alter=alter;
        this.isCorrupt=isCorrupt;
    }
    
    public boolean verurteile(Schurke s){
        if(this.isCorrupt){
            s.setVerurteilung(false);
            return false;
        } else {
            s.setVerurteilung(true);
            return true;
        }
    }
}
