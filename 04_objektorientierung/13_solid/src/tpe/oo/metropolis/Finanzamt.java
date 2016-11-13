package tpe.oo.metropolis;

public class Finanzamt {
    
    private static final Finanzamt FINANZAMT = new Finanzamt();
    
    private static Steuerpflichtig[] steuerpflichtige = new Steuerpflichtig[3];
    
    private Finanzamt(){
        
    }
    
    
    public int steuer(){
        int steuern=0;
       for(Steuerpflichtig s : steuerpflichtige){
           steuern+=s.steuer();
       } return steuern;
    }
    
    public static Finanzamt getFinanzamt(){
        return FINANZAMT;
    }
    
    protected static void addSteuerpflichtigen(Steuerpflichtig s){
        for(int i=0; i<=steuerpflichtige.length; i++){
            if(steuerpflichtige[i]==null){
                steuerpflichtige[i]=s;
                return;
            }
        }
    }

}
