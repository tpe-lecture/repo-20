package tpe.oo.metropolis;

public class Kapitalgesellschaft extends Unternehmen implements Koerperschaftssteuerpflichtig {
    
    protected Buerger[] gesellschafter;

    @Override
    public int steuer() {
        return gewerbesteuer()+koerperschaftssteuer();
    }

    @Override
    public int gewerbesteuer() {
       return (int)(this.gewinn*0.15);
    }

    @Override
    public int koerperschaftssteuer() {
        return(int)(this.gewinn*0.15);
    }
    

}
