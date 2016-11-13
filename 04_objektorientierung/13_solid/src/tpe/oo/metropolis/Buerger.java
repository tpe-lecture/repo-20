package tpe.oo.metropolis;

public class Buerger extends Mensch implements Einkommenssteuerpflichtig{
    
    public Buerger(String name,int alter, int einkommen){
        this.name=name;
        this.alter=alter;
        this.einkommen=einkommen;
    }
    
    @Override
    public int einkommenSteuer(){
        int versteuertesEinkommen=0;
        if (this.einkommen<=20000){
            versteuertesEinkommen=(int)(this.einkommen*STEUERSATZ_1);
            return versteuertesEinkommen;
        }else if(this.einkommen<=60000){
            int rest=this.einkommen-20000;
            versteuertesEinkommen=(int)(20000*STEUERSATZ_1+rest*STEUERSATZ_2);
            return versteuertesEinkommen;
        }else if(this.einkommen<=120000){
            int rest=this.einkommen-60000;
            versteuertesEinkommen=(int)(20000*STEUERSATZ_1+40000*STEUERSATZ_2+rest*STEUERSATZ_3);
            return versteuertesEinkommen;
        }else if(this.einkommen>120000){
            int rest=this.einkommen-120000;
            versteuertesEinkommen=(int)(20000*STEUERSATZ_1+40000*STEUERSATZ_2+60000*STEUERSATZ_3+rest*STEUERSATZ_4);
            return versteuertesEinkommen;
        }else return -1;
    }

    @Override
    public int steuer() {    
        return this.einkommenSteuer();
    }


}
