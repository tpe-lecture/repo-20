package tpe.exceptions.trycatch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

/**
 * Ein simples Zahlenraten-Spiel.
 */
public final class Zahlenraten {

    /**
     * Liest einen String von der Tastatur.
     *
     * @return der gelesene String
     *
     */
    private static String readNumber()  {
        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));
        String input = "";
        try {
            input = br.readLine();
            return input;
        }
        catch (IOException e) {
            System.out.println("Fehler beim Lesen der Konsole");
            return input;
        }


    }

    /**
     * Hauptmethode.
     *
     * @param args Kommandozeilenargumente
     * @throws IOException I/O-Fehler
     */
    public static void main(String[] args)
            throws IOException {

        // zu ratende Zahl bestimmen
        int zahl = new Random().nextInt(100) + 1;

        int versuche = 0;

        while (true) {
            System.out.print("Bitte geben Sie eine Zahl ein: ");
            try {
                int geraten  = Integer.parseInt(readNumber());
                versuche++;


                if (geraten < zahl) {
                    System.out.println("Zu niedrig");
                }
                else if (geraten > zahl) {
                    System.out.println("Zu hoch.");
                }
                else {
                    System.out.printf("Richtig in %d Versuchen", versuche);
                    break;
                }
            }
            catch (NumberFormatException e) {
                System.out.println("Sie haben eine falsche Angabe gemacht");

            }
        }
    }
}
