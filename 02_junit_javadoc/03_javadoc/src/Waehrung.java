/**
 * Klasse, die eine Währung repräsentiert. Jede Währung besitzt einen Namen, ein Kürzel 
 * und einen Kurs (in Bezug auf Dollar)
 * 
 * Mit Hilfe des Konstruktors können neue Währungen erzeugt und initialisiert werden.
 * 
 * <pre>
 * Waehrung euro = new Waehrung ("Euro", ""
 * 
 * @author Thomas Smits
 *
 */
public class Waehrung {

    /**
     * gibt den Kurs der referenzierten Währung in int an, bezogen auf Dollar
     */
    private final int kurs;

    /**
     * gibt den Namen der Währung als String an
     * bspw. "Euro"
     */
    private final String name;

    /**
     * gibt das Kürzel der Währung als String an
     * bspw. "€"
     */
    private final String kuerzel;

    /**
     * Teiler als long zur Umrechnung der Währung
     */
    private static final long TEILER = 10000;

    /**
     * Erzeugt ein neues Objekt.
     *
     * @param name Name der Währung (z.B. EURO).
     * @param kuerzel Kürzel der Währung (z.B. €).
     * @param kurs Wechselkurs zum Dollar.
     */
    public Waehrung(String name, String kuerzel, double kurs) {
        this.kurs = (int) (kurs * TEILER);
        this.name = name;
        this.kuerzel = kuerzel;
    }

    /**
     * 
     * @param betrag Geldbetrag der umgerechnet werden soll 
     * @param toWaehrung gewünschte Währung, Objekt der Klasse Währung
     * @return
     */
    public long umrechnen(long betrag, Waehrung toWaehrung) {
        return betrag * kurs / toWaehrung.kurs;
    }

    /**
     * 
     * @return gibt den Kurs der Währung als int zurück (in Bezug auf Dollar)
     */
    public int getKurs() {
        return kurs;
    }
    
    /**
     * 
     * @return gibt den Namen der Währung als String zurück
     */
    public String getName() {
        return name;
    }

    /**
     * 
     * @return gibt das Kürzel der Währung als String zurück
     */
    public String getKuerzel() {
        return kuerzel;
    }

    /**
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return String.format("%s [%s] 1 %s = %.4f %s",
                name, kuerzel, "$",
                kurs / (double) TEILER, kuerzel);
    }

    /**
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result
                + ((name == null) ? 0 : name.hashCode());
        result = prime * result + kurs;
        result = prime * result
                + ((kuerzel == null) ? 0 : kuerzel.hashCode());
        return result;
    }

    /**
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Waehrung other = (Waehrung) obj;
        if (name == null) {
            if (other.name != null) {
                return false;
            }
        }
        else if (!name.equals(other.name)) {
            return false;
        }
        if (kurs != other.kurs) {
            return false;
        }
        if (kuerzel == null) {
            if (other.kuerzel != null) {
                return false;
            }
        }
        else if (!kuerzel.equals(other.kuerzel)) {
            return false;
        }
        return true;
    }
}
