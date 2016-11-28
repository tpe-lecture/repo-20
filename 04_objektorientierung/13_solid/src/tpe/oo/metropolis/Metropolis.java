package tpe.oo.metropolis;

import java.util.LinkedList;

public class Metropolis {

    private static final Metropolis METROPOLIS = new Metropolis();

//    private Einwohner[] einwohner;

    private LinkedList<Einwohner> einwohner = new LinkedList<Einwohner>();

    private LinkedList<Unternehmen> unternehmen = new LinkedList<Unternehmen>();

    private LinkedList<Syndikat> syndikate = new LinkedList<Syndikat>();

    /**
     * keine neuen Instanzen von Metropolis
     */

    private Metropolis(){
        //leerer Konstruktor
    }

    /**
     * gibt einzige Instanz von Metropolis zurück
     * @return METROPOLIS
     */
    public static Metropolis getMetropolis() {
        return METROPOLIS;
    }

    /**
     * fügt der Liste einwohner einen Einwohner hinzu
     * @param e Einwohner, der hinzugefügt werden soll
     */
    public void addEinwohner(Einwohner e) {
        einwohner.add(e);
    }

    /**
     * fügt der Liste unternehmen ein Unternehmen hinzu
     * @param e Unternehmen, welches hinzugefügt werden soll
     */
    public void addUnternehmen(Unternehmen e) {
        unternehmen.add(e);
    }
    /**
     * fügt der Liste syndikate ein Syndikat hinzu
     * @param e Syndikat, welches hinzugefügt werden soll
     */
    public void addSyndikat(Syndikat e) {
        syndikate.add(e);
    }


    /**
     * gibt den Namen aller Einwohner der Liste einwohner nacheinander aus
     */
    public void printEinwohner() {
        for(int i=0; i<einwohner.size(); i++) {
            System.out.println(i+1+". "+einwohner.get(i).name);
            System.out.println();
        }
    }

    /**
     * gibt den Namen aller Unternehmen der Liste unternehmen nacheinander aus
     */
    public void printUnternehmen() {
        for(int i=0; i<unternehmen.size(); i++) {
            System.out.println(i+1+". "+unternehmen.get(i).name);
            System.out.println();
        }
    }

    /**
     *gibt den Namen aller Syndikate der Liste syndikate nacheinander aus
     */
    public void printSyndikate() {
        for(int i=0; i<syndikate.size(); i++) {
            System.out.println(i+1+". "+syndikate.get(i).name);
        }
    }

    /**
     * sucht den Namen des gewünschten Einwohners in der Liste einwohner und gibt diesen dann aus
     * @param name Name des Einwohners
     * @return gesuchter Einwohner, null wenn Einwohner nicht existiert
     */
    public Einwohner getEinwohner(String name) {
        for(int i=0; i<einwohner.size(); i++) {
            if(einwohner.get(i).name.equals(name)) {
                return einwohner.get(i);
            }
        }
        return null;
    }

    /**
     * entfernt den gewünschten Einwohner aus der Liste einwohner
     * @param e Einwohner, der entfernt werden soll
     */
    public void deleteEinwohner(Einwohner e) {
        einwohner.remove(e);
    }

    /**
     * sucht den Namen des gewünschten Syndikats in der Liste syndikate und gibt diesen dann aus
     * @param name Name des Syndikats
     * @return gesuchtes Syndikat, null wenn Syndikat nicht existiert
     */
    public Syndikat getSyndikat(String name) {
        for(int i=0; i<syndikate.size(); i++) {
            if(syndikate.get(i).name.equals(name)) {
                return syndikate.get(i);
            }
        }
        return null;
    }

    /**
     * sucht den Namen des gewünschten Unternehmens in der Liste unternehmen und gibt diesen dann aus
     * @param name Name des Unternehmens
     * @return gesuchtes Unternehmen, null wenn Unternehmen nicht existiert
     */
    public Unternehmen getUnternehmen(String name) {
        for(int i=0; i<unternehmen.size(); i++) {
            if(unternehmen.get(i).name.equals(name)) {
                return unternehmen.get(i);
            }
        }
        return null;
    }
    /**
     * prüft, ob es einen Einwohner mit dem eingegebenen Namen gibt
     * @param name Name des Einwohners
     * @return true, wenn Einwohner gefunden wurde, false, wenn nicht
     */
    public boolean contains(String name) {
        if(Metropolis.getMetropolis().getEinwohner(name)!=null) {
            return true;
        }
        return false;
    }

    /**
     *
     * @return Größe der Liste einwohner
     */
    public int einwohnerLength() {
        return einwohner.size();
    }
    /**
     *
     * @return Größe der Liste unternehmen
     */
    public int unternehmenLength() {
        return unternehmen.size();
    }

}
