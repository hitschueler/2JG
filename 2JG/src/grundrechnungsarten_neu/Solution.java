package grundrechnungsarten_neu;

import java.util.ArrayList;
/**
 * ArrayList vom Datentyp <T>
 * enth�lt eine komplette L�sung
 * 
 * @author Walter Rafeiner-Magor
 * @version 2.0
 *
 * @param <T> Datentyp einer Variablen
 */
public class Solution<T extends Number> {
	private int anzahl;
	private ArrayList<T> val;
	/**
	 * gibt Referenz  an stelle index zur�ck
	 * @param index
	 * @return Element <T>
	 */
	public T getVal(int index){
		return val.get(index);
	}
	/**
	 * f�gt neuen Eintrag an stelle index hinzu
	 * @param index
	 * @param element
	 */
	public void setVal(int index, T element){
		this.val.add(index, element);
	}
	/**
	 * ersetzt vorhandenen Eintrag an stelle index
	 * @param index
	 * @param element
	 */
	public void changeVal(int index, T element){
		this.val.set(index, element);
	}
	/**
	 * gibt die Initialgr��e zur�ck
	 * @return
	 */
	public int length(){
		return anzahl;
	}
	/**
	 * Allgemeiner Konstruktor
	 * erstellt eine ArrayList in
	 * angegebener Gr��e
	 * @param anzahl
	 */
	Solution(int anzahl){
		val=new ArrayList<T>(anzahl);
		this.anzahl=anzahl;
	}
	
}
