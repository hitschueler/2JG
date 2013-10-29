/**
 * 
 */
package vererbung;

import java.io.Serializable;

/**
 * @author Walter Rafeiner-Magor
 *
 */
public interface Printable extends Serializable{
	/**
	 * Print-Methode f�r die Konsole
	 * @param newLine soll eine neue Zeile danach ausgegeben werden?
	 */
	public void print(boolean newLine);
	/**
	 * Gibt den Namen der Klasse zurueck
	 * @return Name als String
	 */
	public String getKlassenName();
	public final static boolean WAHR=true; // Klassenkonstante
	public final static boolean FALSCH=false; // Klassenkonstante
}
