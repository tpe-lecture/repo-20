package tpe.oo.metropolis;

public class Personengesellschaft extends Unternehmen implements Einkommenssteuerpflichtig {
    
    protected Buerger[] inhaber;
    
    @Override
    public int gewerbesteuer(){
        if(this.gewinn<=800){
            return 0;
        }else return (int)(this.gewinn*this.STEUERSATZ-800);
    }

    @Override
    public int steuer() {
        return gewerbesteuer()+einkommenSteuer();
    }

    @Override
    public int einkommenSteuer() {
            int versteuertesgewinn=0;
            if (this.gewinn<=20000){
                versteuertesgewinn=(int)(this.gewinn*STEUERSATZ_1);
                return versteuertesgewinn;
            }else if(this.gewinn<=60000){
                int rest=this.gewinn-20000;
                versteuertesgewinn=(int)(20000*STEUERSATZ_1+rest*STEUERSATZ_2);
                return versteuertesgewinn;
            }else if(this.gewinn<=120000){
                int rest=this.gewinn-60000;
                versteuertesgewinn=(int)(20000*STEUERSATZ_1+40000*STEUERSATZ_2+rest*STEUERSATZ_3);
                return versteuertesgewinn;
            }else if(this.gewinn>120000){
                int rest=this.gewinn-120000;
                versteuertesgewinn=(int)(20000*STEUERSATZ_1+40000*STEUERSATZ_2+60000*STEUERSATZ_3+rest*STEUERSATZ_4);
                return versteuertesgewinn;
            }else return -1;
        }
    

}
