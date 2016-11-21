package tpe.oo.metropolis;

public class Superkraft {

    protected String name;
    /**
     *
     * erstellt eine Instanz von Superkraft. Superkräfte kann man miteinander vergleichen
     * und von ihnen kann man den hashcode bestimmen.
     *
     * @param name Name der Superkraft
     */
    public Superkraft(String name) {
        this.name=name;
    }
    /**
     * @return true wenn das Objekt o gleich this ist.
     */
    @Override
    public boolean equals(Object o) {
        //Reflexivität
        if(this==o) {
            return true;
        }
        //Nullbarkeit
        if(o==null) {
            return false;
        }
        //Gleiche Superkraft aber verschiedenes Objekt
        if(o instanceof Superkraft) {
            Superkraft test=(Superkraft)o;
            if(this.name.equals(test.name)) {
                return true;
            }
        }
        return false;
    }

    /**
     * @return hashcode() von dem String name
     */
    @Override
    public int hashCode() {
        return name.hashCode();
    }

}
