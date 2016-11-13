package tpe.oo.metropolis;

public interface Koerperschaftssteuerpflichtig extends Steuerpflichtig{
    
    public static final double STEUERSATZ=0.15;

    public int koerperschaftssteuer();
}
