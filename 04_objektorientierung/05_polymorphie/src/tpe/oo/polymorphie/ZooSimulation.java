package tpe.oo.polymorphie;

import tpe.oo.polymorphie.tiere.Affe;
import tpe.oo.polymorphie.tiere.Giraffe;
import tpe.oo.polymorphie.tiere.Gorilla;
import tpe.oo.polymorphie.tiere.ZooTier;

/**
 * Simulationsklasse.
 */
public final class ZooSimulation {

    /**
     * Konstruktor.
     */
    private ZooSimulation() {
        // keine Objekte benötigt
    }

    private static ZooTier[] tiere = {new Affe("Charlie"),
                                      new Gorilla("Buck"),
                                      new Giraffe("Debbie")};

    /**
     * Main-Methode.
     *
     * @param args Kommandozeilen-Argumente.
     */
    public static void main(String[] args) {
        Futterstelle futterstelle = new Futterstelle(); 
        for (ZooTier tier: tiere) {
            System.out.println(tier);
        }

        System.out.println("Fütterung...");

        for (ZooTier tier: tiere) {
            futterstelle.gibFutter(tier);
        }

        for (ZooTier tier: tiere) {
            System.out.println(tier);
        }
    }
}
