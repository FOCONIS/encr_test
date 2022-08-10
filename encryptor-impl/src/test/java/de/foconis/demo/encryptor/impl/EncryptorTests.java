package de.foconis.demo.encryptor.impl;


import de.foconis.demo.encryptor.api.Encryptor;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests für Ver- und Entschlüsselung.
 */
class EncryptorTests {
	Encryptor encryptor = new BetterEncryptor();

	/**
	 * Testet die grundlegende Funktionalität des Encryptors.
	 */
	@Test
	void test() {
		int enc = encryptor.encrypt(123);
		int dec = encryptor.decrypt(enc);
		assertThat(dec).isEqualTo(123);
	}

}
