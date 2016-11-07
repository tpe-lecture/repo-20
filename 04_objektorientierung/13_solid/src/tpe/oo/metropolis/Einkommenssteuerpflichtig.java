package tpe.oo.metropolis;

public interface Einkommenssteuerpflichtig extends Steuerpflichtig {
    
    public final double STEUERSATZ_1=0.92;
    public final double STEUERSATZ_2=0.85;
    public final double STEUERSATZ_3=0.75;
    
    public int einkommenSteuer();

}
