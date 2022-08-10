package de.foconis.demo.encryptor.impl;

import de.foconis.demo.encryptor.api.Encryptor;

/**
 * Ein encryptor hat 2 Methoden um eine Zahl zu verschlüsseln und auch wieder zu entschlüsseln
 */
public class DummyEncryptor implements Encryptor {

	@Override
	public Integer encrypt(Integer plain) {
		return plain + 42;
	}

	@Override
	public Integer decrypt(Integer encrypted) {
		return encrypted - 42;
	}
}
