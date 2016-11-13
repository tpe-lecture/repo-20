package tpe.oo.metropolis;

public class Superkraft {

    protected String name;
    
    public Superkraft(String name){
        this.name=name;
    }
    
    @Override
    public boolean equals(Object o){
        if(name.equals(o.toString())){
            return true;
        }else return false;
    }
    @Override
    public String toString(){
        return name;
    }
    

}
