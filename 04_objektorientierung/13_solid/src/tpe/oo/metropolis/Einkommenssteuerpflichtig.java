package tpe.oo.metropolis;

public interface Einkommenssteuerpflichtig extends Steuerpflichtig {
    
    public static final double STEUERSATZ_1=0.08;
    public static final double STEUERSATZ_2=0.15;
    public static final double STEUERSATZ_3=0.25;
    public static final double STEUERSATZ_4=0.4;
    
    /**
     * Eine progressive Steuer auf das Einkommen von Bürgern, Personengesellschaften und Schurken.
     * die ersten 20.000 Metro-Dollar werden mit 8% besteuert
     * die nächsten 40.000 Metro-Dollar werden mit 15% besteuert
     * die nächsten 60.000 Metro-Dollar werden mit 25% besteuert
     * jeder weitere Metro-Dollar wird mit 40% besteuert
     * @return den Wert der Steuer als int
     */
    public int einkommenSteuer();

}
