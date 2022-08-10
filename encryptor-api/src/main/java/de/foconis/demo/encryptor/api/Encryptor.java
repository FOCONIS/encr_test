package de.foconis.demo.encryptor.api;

/**
 * Ein encryptor hat 2 Methoden um eine Zahl zu verschlüsseln und auch wieder zu entschlüsseln
 */
public interface Encryptor {

	/**
	 * Verschlüsselt eine Zahl. Die Rückgabe ist wieder eine Zahl, welche i.d.R. von der Eingabe abweicht.
	 */
	Integer encrypt(Integer plain);

	/**
	 * Entschlüsselt eine Zahl welche zuvor verschlüsselt wurde. Die Rückgabe entspricht dem Wert, der zuvor verschlüsselt wurde.
	 */
	Integer decrypt(Integer encrypted);
}
