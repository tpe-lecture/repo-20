package tpe.oo.metropolis;

public class Syndikat implements Koerperschaftssteuerpflichtig{
    
    protected String name;
    protected Schurke[] schurken = new Schurke[10];
    
    public Syndikat(String name){
        this.name=name;
    }
    
    private int getSyndikatEinkommen(){
        int einkommen=0;
        for(Schurke s : schurken) {
            einkommen+=s.einkommen;
        } return einkommen;
    }

    @Override
    public int steuer() {
        return this.koerperschaftssteuer();
    }

    @Override
    public int koerperschaftssteuer() {
        return (int)(getSyndikatEinkommen()*this.STEUERSATZ);
    }
    
    public void addSchurke(Schurke schurke){
        for(int i=0;i<=schurken.length;i++){
            if(schurken[i]==null){
                schurken[i]=schurke;
                return;
            }
        }
        
    }

}
