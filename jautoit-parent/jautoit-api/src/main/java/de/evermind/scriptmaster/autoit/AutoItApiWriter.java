package de.evermind.scriptmaster.autoit;

/**
 * Creates a structure compatible for creating java (and javascript) types out of the autoit header files.
 */
public class AutoItApiWriter {

	/**
	 * API-Funktionen werden aus den Headern extrahiert:<br/>
	 * Zeilen die mit AU3_API starten werden zerlegt:<br/>
	 * Der R�ckgabetyp wird direkt angewendet.<br/>
	 * WIN_API und der AU3_ header werden ignoriert.<br/>
	 * Type-Mappings. LPCWSTR => String, int => int (eigtl. long, theoretisch ja plattform-abh�ngig).<br/>
	 * R�ckgabe:<br/>
	 * void oder int ODER HANDLE (?)<br/>
	 * Default-Werte m�ssen aus den Kommandos angewendet werden.<br/>
	 * Strings sind an der R�ckgabe LPWSTR szResult, int nBufSize erkennbar.
	 * 
	 */
	public void writeClass(){
		// if li
	}
	
	
}
