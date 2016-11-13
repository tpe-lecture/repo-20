package tpe.oo.metropolis;

public interface Einkommenssteuerpflichtig extends Steuerpflichtig {
    
    public static final double STEUERSATZ_1=0.08;
    public static final double STEUERSATZ_2=0.15;
    public static final double STEUERSATZ_3=0.25;
    public static final double STEUERSATZ_4=0.4;
    
    
    public int einkommenSteuer();

}
